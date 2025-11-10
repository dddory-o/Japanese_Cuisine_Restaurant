package restaurant.observer;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public interface Observer {
    void update(Meal meal, Drink drink, Soup soup);
    void update(Meal decoratedMeal);
}
