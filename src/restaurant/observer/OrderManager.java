package restaurant.observer;

import restaurant.factory.Meal;
import java.util.*;

public class OrderManager implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private Meal meal;

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
            observer.update(meal);
        }
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
        notifyObservers();
    }

}
