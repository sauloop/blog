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

import info.pablogiraldo.blog.dao.ArticleDAO;
import info.pablogiraldo.blog.model.Article;

/**
 * Servlet implementation class ArticleController
 */
@WebServlet("/")
public class ArticleController extends HttpServlet {
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

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertArticle(request, response);
				break;
			case "/delete":
				deleteArticle(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateArticle(request, response);
				break;
			default:
				listArticle(request, response);
				break;
			}
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
		List<Article> listArticle = articleDAO.listAllArticles();
		request.setAttribute("listArticle", listArticle);
		RequestDispatcher dispatcher = request.getRequestDispatcher("articleList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("articleForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Article existingArticle = articleDAO.getArticle(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("articleForm.jsp");
		request.setAttribute("article", existingArticle);
		dispatcher.forward(request, response);

	}

	private void insertArticle(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String title = request.getParameter("title");
		String subtitle = request.getParameter("subtitle");
		String image = request.getParameter("image");
		String link = request.getParameter("link");
		String text = request.getParameter("text");

		Article newArticle = new Article(title, subtitle, image, link, text);
		articleDAO.insertArticle(newArticle);
		response.sendRedirect("articles");
	}

	private void updateArticle(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String subtitle = request.getParameter("subtitle");
		String image = request.getParameter("image");
		String link = request.getParameter("link");
		String text = request.getParameter("text");

		Article article = new Article(id, title, subtitle, image, link, text);
		articleDAO.updateArticle(article);
		response.sendRedirect("articles");
	}

	private void deleteArticle(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		Article article = new Article(id);
		articleDAO.deleteArticle(article);
		response.sendRedirect("articles");

	}

}
