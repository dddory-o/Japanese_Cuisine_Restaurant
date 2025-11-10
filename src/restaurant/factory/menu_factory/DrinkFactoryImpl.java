package restaurant.factory.menu_factory;

import restaurant.factory.drink.Coke;
import restaurant.factory.drink.Drink;
import restaurant.factory.drink.Fanta;
import restaurant.factory.drink.Sprite;

public class DrinkFactoryImpl implements DrinkFactory {
    @Override
    public Drink createDrink(String description) {
        return switch (description.toLowerCase()){
            case "coke" -> new Coke();
            case "fanta" -> new Fanta();
            case "sprite" -> new Sprite();
            default -> null;
        };
    }
}