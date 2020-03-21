package info.pablogiraldo.blog.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String EMAIL = "fulano@email.com";
	private static final String PASS = "secret";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		String isAdmin = "default";

		if (email.equals(EMAIL) && pass.equals(PASS)) {
			isAdmin = "admin";
			request.setAttribute("isAdmin", isAdmin);
			request.getRequestDispatcher("admin.jsp").forward(request, response);
		}

		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
