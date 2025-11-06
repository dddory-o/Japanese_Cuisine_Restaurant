package restaurant.visitor;

import restaurant.factory.Meal;

public interface MealVisitor {
    void visit(Meal meal);

    int getTotalCalories();
}
