package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(duck);
        }
    }
}
