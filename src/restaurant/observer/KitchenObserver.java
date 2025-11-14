package restaurant.observer;

import restaurant.decorator.ProductDecorator;
import restaurant.factory.Product;
import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KitchenObserver implements Observer {

    @Override
    public void update(Product product) {

        System.out.println("New order!");
        Product original = product;
        while (original instanceof Product dec) {
            original = dec.getDescription();
        }

        System.out.println(":" + original.getDescription());

        Product current = product;
        List<String> additions = new ArrayList<>();

        while (current instanceof ProductDecorator dec) {
            additions.add(dec.getOwnAddition());
            current = dec.getDescription();
        }

        // добавки в правильном порядке
        Collections.reverse(additions);

        System.out.println("With:");
        for (String add : additions) {
            System.out.println(" + " + add);
        }

        System.out.println("Final order: " + product.getDescription());
    }
}
