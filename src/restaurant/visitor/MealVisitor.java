package restaurant.visitor;

import restaurant.factory.meal.Meal;

public interface MealVisitor {
    void accept(Meal meal);

    int getTotalCalories();
}
