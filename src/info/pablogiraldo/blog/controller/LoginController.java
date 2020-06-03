package info.pablogiraldo.blog.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

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

	private static final String EMAIL = "admin@prueba.com";
	private static final String ENCODE_PASS = "ebcf3ef0ea4d4b99d990b9072dddea1c97a3e7e8b5f2442bb83092aff49bdff0c98a471a90520d14f3234213487d9693e314ba879cf038919c62d509d6279cfd";

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

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		String encode_pass = null;

		if (pass != null) {
			encode_pass = getSHA512(pass);

			System.out.println(encode_pass);
		}

		if (email != null && encode_pass != null && email.equals(EMAIL) && encode_pass.equals(ENCODE_PASS)) {

			HttpSession session = request.getSession(true);
			session.setAttribute("userSession", "loggedin");

			response.sendRedirect("admin");
		}

		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	public static String getSHA512(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return toReturn;
	}

}
