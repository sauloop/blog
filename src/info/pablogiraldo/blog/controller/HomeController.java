package info.pablogiraldo.blog.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import info.pablogiraldo.blog.dao.ArticleDAO;
import info.pablogiraldo.blog.model.Article;

// http://localhost:8080/blog/

/**
 * Servlet implementation class ArticleController
 */
@WebServlet("/")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArticleDAO articleDAO;

	public void init() {

		articleDAO = new ArticleDAO();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		request.getRequestDispatcher("/view/index.jsp").forward(request, response);

		request.setAttribute("isSessionInit", "false");
//
		HttpSession session = request.getSession(true);

		if (session.getAttribute("userSession") != null && session.getAttribute("userSession").equals("loggedin")) {
			request.setAttribute("isSessionInit", "true");
		}

//		if (session.getAttribute("userSession").equals("loggedin")) {
//			request.setAttribute("isSessionInit", "true");
//		}

		String option = request.getParameter("option");

		if (option == null) {
			option = "";
		}

		if (option.equals("sessionClose")) {
//			HttpSession session = request.getSession(true);
			session.setAttribute("userSession", "loggedout");
			request.setAttribute("isSessionInit", "false");
		}

		try {

			listArticle(request, response);

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void listArticle(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String fromController = "controller";
		List<Article> listArticle = articleDAO.listAllArticles();

		request.setAttribute("listArticle", listArticle);
		request.setAttribute("fromController", fromController);

		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

}
