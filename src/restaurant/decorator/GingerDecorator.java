package restaurant.decorator;

import restaurant.factory.meal.Meal;

abstract class GingerDecorator extends MealDecorator{
    public GingerDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription() + ", Ginger";
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost() + 50;
    }
}
