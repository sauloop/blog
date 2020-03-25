package info.pablogiraldo.blog.model;

public class Article implements Comparable<Article> {

	private int id;
	private String title;
	private String subtitle;
	private String image;
	private String link;
	private String text;

	public Article() {
	}

	public Article(int id) {
		this.id = id;
	}

	public Article(int id, String title, String subtitle, String image, String link, String text) {
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.image = image;
		this.link = link;
		this.text = text;
	}

	public Article(String title, String subtitle, String image, String link, String text) {
		this.title = title;
		this.subtitle = subtitle;
		this.image = image;
		this.link = link;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int compareTo(Article comparearticle) {
		int compareids = ((Article) comparearticle).getId();
		return compareids - this.id;
	}
}
