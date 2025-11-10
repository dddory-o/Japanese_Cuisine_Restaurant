package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class BakedPreparation implements PreparationStrategy{
    @Override
    public void prepare(Meal meal) {
        System.out.println(meal.getDescription()+"preparing by baking.");
    }
    @Override
    public void modifyCalories(Meal meal) {
        System.out.println("Baked" + meal.getDescription() + "calories" + meal.getCalories() * 1.1);
    }
}

