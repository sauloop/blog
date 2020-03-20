package info.pablogiraldo.blog.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	// Dev

//	private static String url = "jdbc:mysql://localhost:3306/db_blog";
//	private static String user = "root";
//	private static String pass = "";

	// Prod

	private static String url = "jdbc:mysql://r42ii9gualwp7i1y.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/lmupva5bdjr1mdw9";
	private static String user = "wbbd4ix2tkuhv33q";
	private static String pass = "syz56f5pn4im9fe1";

	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
