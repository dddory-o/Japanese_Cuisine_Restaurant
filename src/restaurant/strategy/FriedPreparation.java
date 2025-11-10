package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class FriedPreparation implements PreparationStrategy {
    @Override
    public void prepare(Meal meal) {
        System.out.println(meal.getDescription()+"preparing by frying.");
    }
}
