package restaurant.factory.menu_factory;

import restaurant.factory.drink.Drink;

public interface DrinkFactory {
    Drink createDrink(String description);
}
