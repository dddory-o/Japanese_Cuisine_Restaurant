package restaurant.decorator;

import restaurant.factory.meal.Meal;
import restaurant.decorator.MealDecorator;

class ChopstickDecorator extends MealDecorator {
    public ChopstickDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription() + ", Chopsticks";
    }

    @Override
    public int getQuantity(){
        return decoratedMeal.getQuantity();
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost() + 50;
    }
}
