package restaurant.visitor;

import restaurant.decorator.MealDecorator;
import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public interface OrderVisitor {
    void visit(Meal meal);

    void visit(Drink drink);

    void visit(Soup soup);
}
