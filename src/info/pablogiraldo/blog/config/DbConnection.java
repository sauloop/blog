package info.pablogiraldo.blog.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

//	private static String url = "jdbc:mysql://localhost:3306/db_blog_b?useUnicode=yes&characterEncoding=UTF-8";

	// Dev

//	private static String url = "jdbc:mysql://localhost:3306/db_blog";
//	private static String user = "root";
//	private static String pass = "";

	// Prod pruebasblog

	private static String url = "jdbc:mysql://gi6kn64hu98hy0b6.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/x4y287x0mhb2xxtd";
	private static String user = "s1o3v3rkbdhm1bc7";
	private static String pass = "jb6i5e6gv772zidi";

	// Prod blogwar

//	private static String url = "jdbc:mysql://sabaik6fx8he7pua.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/ktqz1wuhfsknweaa";
//	private static String user = "gi339d995q304vv7";
//	private static String pass = "cu4vwab283ehef6z";

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
