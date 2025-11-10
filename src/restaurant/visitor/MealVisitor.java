package restaurant.visitor;

import restaurant.factory.meal.Meal;

public interface MealVisitor {
    void visit(Meal meal);

    int getTotalCalories();
}
