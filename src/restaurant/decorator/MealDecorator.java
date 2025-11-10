package restaurant.decorator;

import restaurant.factory.meal.Meal;

abstract class MealDecorator implements Meal {
    protected Meal decoratedMeal;

    public MealDecorator(Meal decoratedMeal){
        this.decoratedMeal = decoratedMeal;
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription();
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost();
    }
}
