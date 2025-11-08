package restaurant.decorator;

import restaurant.factory.Meal;

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
}
