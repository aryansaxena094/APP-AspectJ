public class Newspaper implements Observer {
	private Blogger blogger;
	private String state;

	public Newspaper(Blogger blogger) {
		this.blogger = blogger;
		this.blogger.addObserver(this);
	}

	public void update() {
		this.state = blogger.getHeadline();
	}

	public String getState() {
		return "Newspaper: " + this.state;
	}

}