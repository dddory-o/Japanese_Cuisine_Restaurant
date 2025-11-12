package restaurant.decorator;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class ChopstickDecorator extends MealDecorator {
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

    @Override
    public void accept(OrderVisitor visitor){
        decoratedMeal.accept(visitor);
    }
}
