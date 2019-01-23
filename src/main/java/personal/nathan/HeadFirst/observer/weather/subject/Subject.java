package personal.nathan.HeadFirst.observer.weather.subject;

import personal.nathan.HeadFirst.observer.weather.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
