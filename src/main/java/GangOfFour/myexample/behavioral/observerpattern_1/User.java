package GangOfFour.myexample.behavioral.observerpattern_1;

public class User implements Observer {

	private String article;
	private Subject blog;

	public void setSubject(Subject blog) {
		this.blog = blog;
		article = "No New Article!";
	}

	@Override
	public void update() {
		System.out.println("State change reported by Subject.");
		article = (String) blog.getUpdate();
	}

	public String getArticle() {
		return article;
	}
}
