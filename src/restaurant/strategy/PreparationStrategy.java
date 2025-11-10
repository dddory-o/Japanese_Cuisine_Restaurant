package restaurant.strategy;

import restaurant.factory.meal.Meal;

public interface PreparationStrategy {
    void prepare(Meal meal);
    void modifyCalories(Meal meal);
}
