package info.pablogiraldo.blog.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String EMAIL = "fulano@email.com";
	private static final String PASS = "secret";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
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

//		String isAdmin = "default";

		if (email != null && pass != null && email.equals(EMAIL) && pass.equals(PASS)) {
//			String isAdmin = "admin";
//			request.setAttribute("isAdmin", isAdmin);
//			request.getRequestDispatcher("admin.jsp").forward(request, response);

//			request.getRequestDispatcher("admin").forward(request, response);

//			HttpSession session = request.getSession();
//			String username = (String) request.getAttribute("un");
//			session.setAttribute("UserName", username);

			HttpSession session = request.getSession(true);
			session.setAttribute("userSession", "loggedin");

//			System.out.println(session.getAttribute("userSession"));

			response.sendRedirect("admin");
		}

		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
