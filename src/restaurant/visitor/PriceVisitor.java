package restaurant.visitor;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public class PriceVisitor implements OrderVisitor {
    private double totalCost = 0.0;

    public void visit(Meal meal) {
        totalCost += meal.getCost();
        System.out.println("Added cost for Meal: " + meal.getDescription() + " - " + meal.getCost());
    }

    public void visit(Drink drink) {
        totalCost += drink.getCost();
        System.out.println("Added cost for Drink: " + drink.getDescription() + " - " + drink.getCost());
    }

    public void visit(Soup soup) {
        totalCost += soup.getCost();
        System.out.println("Added cost for Drink: " + soup.getDescription() + " - " + soup.getCost());
    }

    public double getTotalCost() {
        return totalCost;
    }
}
