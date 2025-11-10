package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class RawPreparation implements PreparationStrategy{
    @Override
    public void prepare(Meal meal) {
        System.out.println("Raw"+meal.getDescription());
    }
    @Override
    public void modifyCalories(Meal meal) {
        System.out.println("Classic" + meal.getDescription() + "calories" + meal.getCalories());
    }
}
