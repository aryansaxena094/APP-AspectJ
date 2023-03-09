public class Test {
	public static void main(String[] args) {
		Blogger blogger = new Blogger();
		Newsportal observer1 = new Newsportal(blogger);
		Newspaper observer2 = new Newspaper(blogger);
		MobileSubscriber observer3 = new MobileSubscriber(blogger);
		blogger.setHeadline("Le Comiccon de Montreal. " + "Du 13 au 15 septembre 2013.");
		System.out.println(observer1.getState());
		System.out.println(observer2.getState());
		System.out.println(observer3.getState());
	}
}