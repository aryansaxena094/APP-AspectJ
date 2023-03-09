import java.util.*;

public class Blogger implements Subject {
	private String headline;
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++)
			observers.get(i).update();
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String state) {
		this.headline = state;
		this.notifyObservers();
	}
}
