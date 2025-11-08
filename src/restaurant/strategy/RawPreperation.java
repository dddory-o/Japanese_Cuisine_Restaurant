package restaurant.strategy;

import restaurant.factory.Meal;

public class RawPreperation implements PreparationStrategy{
    @Override
    public void prepare(Meal meal) {
        System.out.println("Raw"+meal.getDescription());
    }
}
