package restaurant.observer;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

import java.util.*;

public class OrderManager implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private Meal meal;
    private Drink drink;
    private Soup soup;

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
            observer.update(meal, drink, soup);
        }
    }
    public void placeOrder(Meal meal, Drink drink, Soup soup) {
        this.meal = meal;
        this.drink = drink;
        this.soup = soup;
        notifyObservers();
    }
}
