package personal.nathan.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public abstract class NumberGenerator {

    public List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifiedObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
