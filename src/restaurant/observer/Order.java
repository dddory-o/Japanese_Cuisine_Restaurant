package restaurant.observer;

import restaurant.factory.Meal;

public class Order {
    public EventManager manager;
    private Meal meal;

    public Order() {
        this.manager = new EventManager("placed", "prepared", "delivered");
    }

    public void placeOrder(Meal meal) {
        this.meal = meal;
        System.out.println("Order placed for " + meal.getDescription());
        manager.notify("placed", meal);
    }

    public void prepareOrder() {
        if (meal != null) {
            System.out.println("Order prepared: " + meal.getDescription());
            manager.notify("prepared", meal);
        }
    }

    public void deliverOrder() {
        if (meal != null) {
            System.out.println("Order delivered: " + meal.getDescription());
            manager.notify("delivered", meal);
        }
    }
}
