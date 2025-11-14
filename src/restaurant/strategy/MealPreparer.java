package restaurant.strategy;

import restaurant.factory.meal.Meal;

public class MealPreparer { // Context class
    private PreparationStrategy strategy;

    public MealPreparer() {
        this.strategy = null; // you can set it later
    }

    public void setStrategy(PreparationStrategy strategy) {
        this.strategy = strategy;
    }

    public void prepareMeal(Meal meal) {
        if (strategy == null) {
            System.out.println("No preparation strategy set for " + meal.getDescription());
            return;
        }
        strategy.prepare(meal);
    }

    public void modifyMealCalories(Meal meal) {
        if (strategy == null) {
            System.out.println("No preparation strategy set for " + meal.getDescription());
            return;
        }
        strategy.modifyCalories(meal);
    }
}
