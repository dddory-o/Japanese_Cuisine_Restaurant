package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class FriedPreparation implements PreparationStrategy {
    @Override
    public void prepare(Meal meal) {
        System.out.println(meal.getDescription()+"preparing by frying.");
    }
    @Override
    public void modifyCalories(Meal meal) {
        System.out.println("Fried" + meal.getDescription() + "calories" + meal.getCalories() * 1.3);
    }
}
