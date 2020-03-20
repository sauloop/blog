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

	private static String url = "jdbc:mysql://gi6kn64hu98hy0b6.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/v8ma475jhqbkm8bg";
	private static String user = "pvwbl8zr6yvbtynf";
	private static String pass = "pippn1havhufqy9d";

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
