package restaurant.decorator;

import restaurant.factory.Meal;

public class UnagiDecorator extends  MealDecorator{
    public UnagiDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public String getDescription(){
        return decoratedMeal.getDescription() + ", Unagi";
    }

    @Override
    public double getCost(){
        return decoratedMeal.getCost() + 150;
    }
}
