package restaurant.factory.menu_factory;

import restaurant.factory.meal.Meal;
import restaurant.factory.meal.Rolls;
import restaurant.factory.meal.Sushi;
import restaurant.factory.meal.SushiBurger;

public class MealFactoryImpl implements MealFactory {
    @Override
    public Meal createMeal(String description) {
        return switch (description.toLowerCase()){
            case "rolls" -> new Rolls();
            case "sushi" -> new Sushi();
            case "sushi burger" -> new SushiBurger();
            default -> null;
        };
    }
}
