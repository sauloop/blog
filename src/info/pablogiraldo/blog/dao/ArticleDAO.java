package info.pablogiraldo.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import info.pablogiraldo.blog.config.DbConnection;
import info.pablogiraldo.blog.model.Article;

public class ArticleDAO {

	private Connection connection;

	public ArticleDAO() {

	}

	private Connection getConnection() {
		return DbConnection.getConnection();
	}

	public boolean insertArticle(Article article) throws SQLException {

		String sql = "INSERT INTO articles (title, subtitle, image, link, text ) VALUES (?, ?, ?, ?, ?)";
		connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, article.getTitle());
		statement.setString(2, article.getSubtitle());
		statement.setString(3, article.getImage());
		statement.setString(4, article.getLink());
		statement.setString(5, article.getText());

//		statement.setString(1, article.getTitle());
//		statement.setString(2, "Test subtitle");
//		statement.setString(3, "Test image");
//		statement.setString(4, "Test link");
//		statement.setString(5, "Test text");

		boolean rowInserted = statement.executeUpdate() > 0;

		statement.close();
		connection.close();

		return rowInserted;
	}

	public List<Article> listAllArticles() throws SQLException {

		List<Article> listArticle = new ArrayList<>();
		String sql = "SELECT * FROM articles";
		connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {

			int id = resultSet.getInt("id");
			String title = resultSet.getString("title");
			String subtitle = resultSet.getString("subtitle");
			String image = resultSet.getString("image");
			String link = resultSet.getString("link");
			String text = resultSet.getString("text");

			Article article = new Article(id, title, subtitle, image, link, text);
			listArticle.add(article);
		}

		resultSet.close();
		statement.close();
		connection.close();

		return listArticle;
	}

	public boolean deleteArticle(Article article) throws SQLException {

		String sql = "DELETE FROM articles where id = ?";
		connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, article.getId());

		boolean rowDeleted = statement.executeUpdate() > 0;

		statement.close();
		connection.close();

		return rowDeleted;
	}

	public boolean updateArticle(Article article) throws SQLException {

		String sql = "UPDATE articles SET title = ?, subtitle = ?, image = ?, link = ?, text = ?";
		sql += " WHERE id = ?";
		connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, article.getTitle());
		statement.setString(2, article.getSubtitle());
		statement.setString(3, article.getImage());
		statement.setString(4, article.getLink());
		statement.setString(5, article.getText());
		statement.setInt(6, article.getId());

//		statement.setString(1, article.getTitle());
//		statement.setString(2, "Test subtitle");
//		statement.setString(3, "Test image");
//		statement.setString(4, "Test link");
//		statement.setString(5, "Test text");
//		statement.setInt(6, article.getId());

		boolean rowUpdated = statement.executeUpdate() > 0;

		statement.close();
		connection.close();

		return rowUpdated;
	}

	public Article getArticle(int id) throws SQLException {

		Article article = null;
		String sql = "SELECT * FROM articles WHERE id = ?";
		connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setInt(1, id);

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {

			String title = resultSet.getString("title");
			String subtitle = resultSet.getString("subtitle");
			String image = resultSet.getString("image");
			String link = resultSet.getString("link");
			String text = resultSet.getString("text");

			article = new Article(id, title, subtitle, image, link, text);
		}

		resultSet.close();
		statement.close();

		return article;
	}
}
