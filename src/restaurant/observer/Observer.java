package restaurant.observer;

import restaurant.factory.Product;
import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public interface Observer {
    void update(Product product);
}
