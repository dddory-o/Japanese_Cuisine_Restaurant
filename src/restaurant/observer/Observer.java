package restaurant.observer;

import restaurant.factory.Meal;

public interface Observer {
    void update(String eventType, Meal meal);
}
