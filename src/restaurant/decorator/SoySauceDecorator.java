package restaurant.decorator;

import restaurant.factory.Meal;
import restaurant.visitor.MealVisitor;

abstract class SoySauceDecorator extends MealDecorator{
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
}
