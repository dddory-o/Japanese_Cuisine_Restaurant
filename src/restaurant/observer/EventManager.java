package restaurant.observer;

import restaurant.factory.Meal;
import java.util.*;

public class EventManager {
    Map<String, List<Observer>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Observer observer) {
        List<Observer> users = listeners.get(eventType);
        users.add(observer);
    }

    public void unsubscribe(String eventType, Observer observer) {
        List<Observer> users = listeners.get(eventType);
        users.remove(observer);
    }

    public void notify(String eventType, Meal meal) {
        List<Observer> users = listeners.get(eventType);
        for (Observer observer : users) {
            observer.update(eventType, meal);
        }
    }
}
