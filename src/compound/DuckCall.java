package compound;

public class DuckCall implements Quackable {

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
        notifyObservers();
    }

    public void quack() {
        System.out.println("Kwak");
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return "Duck Call";
    }
}
