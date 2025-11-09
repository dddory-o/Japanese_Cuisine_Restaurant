package restaurant.observer;

import restaurant.factory.Meal;

public interface Observer {
    void update(Meal meal);
}
