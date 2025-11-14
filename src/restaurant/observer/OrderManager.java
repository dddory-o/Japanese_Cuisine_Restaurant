package restaurant.observer;

import restaurant.factory.Product;
import java.util.*;

public class OrderManager implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private Product product;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }

    public void placeOrder(Product product) {
        this.product = product;
        notifyObservers();
    }
}
