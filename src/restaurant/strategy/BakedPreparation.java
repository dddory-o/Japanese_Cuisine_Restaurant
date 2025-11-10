package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class BakedPreparation implements PreparationStrategy{
    @Override
    public void prepare(Meal meal) {
        System.out.println(meal.getDescription()+"preparing by baking.");
    }
}

