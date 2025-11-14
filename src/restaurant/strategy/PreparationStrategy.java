package restaurant.strategy;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;

public interface PreparationStrategy {
    void prepare(Product product);
    void modifyCalories(Product product);
}
