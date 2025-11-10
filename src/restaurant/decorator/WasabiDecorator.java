package restaurant.decorator;

import restaurant.factory.meal.Meal;

abstract class WasabiDecorator extends MealDecorator{
    public WasabiDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription() + ", Wasabi";
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost() + 50;
    }

    @Override
    public int getCalories() {
        return decoratedMeal.getCalories() + 15;
    }
}
