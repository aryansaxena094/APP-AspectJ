public class Newsportal implements Observer {
	private Blogger blogger;
	private String state;

	public Newsportal(Blogger blogger) {
		this.blogger = blogger;
		this.blogger.addObserver(this);
	}

	public void update() {
		this.state = blogger.getHeadline();
	}

	public String getState() {
		return "NewsPortal: " + this.state;
	}

}