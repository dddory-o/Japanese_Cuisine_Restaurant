package restaurant.strategy;

import restaurant.factory.Meal;

public class BakedPreperation implements PreparationStrategy{
    @Override
    public void prepare(Meal meal) {
        System.out.println(meal.getDescription()+"preparing by baking.");
    }
}

