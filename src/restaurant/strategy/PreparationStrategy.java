package restaurant.strategy;

import restaurant.factory.Meal;

public interface PreparationStrategy {
    void prepare(Meal meal);
}
