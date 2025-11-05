package restaurant.factory;

public abstract class MealFactory {
    public abstract Meal createMeal();
}

class SushiFactory extends MealFactory {
    public Meal createMeal() {
        return new Sushi();
    }
}
class RollsFactory extends MealFactory {
    public Meal createMeal() {
        return new Rolls();
    }
}
class SushiBurgerFactory extends MealFactory {
    public Meal createMeal() {
        return new SushiBurger();
    }
}
