package restaurant.factory.menu_factory;

import restaurant.factory.meal.Meal;

public interface MealFactory{
    Meal createMeal(String description);
}
