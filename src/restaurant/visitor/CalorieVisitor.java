package restaurant.visitor;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public class CalorieVisitor implements OrderVisitor {
    private int totalCalories = 0;

    public void visit(Meal meal) {
        totalCalories += meal.getCalories();
        System.out.println("Added calories for Meal: " + meal.getDescription() + " - " + meal.getCalories());
    }

    public void visit(Drink drink) {
        totalCalories += drink.getCalories();
        System.out.println("Added calories for Drink: " + drink.getDescription() + " - " + drink.getCalories());
    }

    public void visit(Soup soup) {
        totalCalories += soup.getCalories();
        System.out.println("Added calories for Soup: " + soup.getDescription() + " - " + soup.getCalories());
    }

    public int getTotalCalories() {
        return totalCalories;
    }
}
