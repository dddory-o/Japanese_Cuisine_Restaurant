package restaurant.decorator;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public abstract class MealDecorator implements Meal {
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

    @Override
    public int getCalories(){
        return decoratedMeal.getCalories();
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedMeal.accept(visitor);
    }
}
