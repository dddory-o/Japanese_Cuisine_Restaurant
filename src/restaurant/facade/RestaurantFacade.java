package restaurant.facade;

import java.util.*;
import restaurant.factory.Meal;

public class RestaurantFacade {
    public void placeOrder(List<Meal> meals){
        System.out.println("=== Processing Order ===");
        if (meals==null|| meals.isEmpty()){
            System.out.println("Order is empty.");
            return;
        }

        double totalCost = 0.0;

        for (Meal meal : meals){
            System.out.println("Order:" + meal.getDescription() + " | Cost:" + meal.getCost());
            totalCost += meal.getCost();
        }


    }
}
