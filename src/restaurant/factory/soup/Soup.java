package restaurant.factory.soup;

import restaurant.visitor.MealVisitor;

public interface Soup {
    String getDescription();
    double getCost();
}
