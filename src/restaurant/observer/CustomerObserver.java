package restaurant.observer;

import restaurant.factory.Meal;

public class CustomerObserver implements Observer {
    private String customerName;

    public CustomerObserver(String name) {
        this.customerName = name;
    }

    @Override
    public void update(Meal meal) {
        System.out.println("Customer " + customerName + " notified: Your " + meal.getDescription() + " is ready.");
    }
}
