package restaurant.decorator;

import restaurant.factory.meal.Meal;
import restaurant.visitor.MealVisitor;

class SoySauceDecorator extends MealDecorator{
    public SoySauceDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription() + ", Soy Sauce";
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost() + 100;
    }

    @Override
    public int getQuantity(){
        return decoratedMeal.getQuantity();
    }

    @Override
    public int getCalories(){
        return decoratedMeal.getCalories() + 20;
    }
}
