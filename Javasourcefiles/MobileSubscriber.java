public class MobileSubscriber implements Observer {
	private Blogger blogger;
	private String state;

	public MobileSubscriber(Blogger blogger) {
		this.blogger = blogger;
		this.blogger.addObserver(this);
	}

	public void update() {
		this.state = blogger.getHeadline();
	}

	public String getState() {
		return "MobileSubscriber: " + this.state;
	}

}