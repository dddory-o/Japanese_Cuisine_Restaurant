package restaurant.observer;

import restaurant.decorator.ProductDecorator;
import restaurant.factory.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KitchenObserver implements Observer {
    @Override
    public void update(Product product) {
        System.out.println("New order!");
        Product original = product;
        while (original instanceof ProductDecorator dec) {
            original = dec.getWrappedProduct();
        }

        System.out.println("Meal name:" + original.getDescription());

        Product current = product;
        List<String> additions = new ArrayList<>();

        while (current instanceof ProductDecorator dec) {
            additions.add(dec.getOwnAddition());
            current = dec.getWrappedProduct();
        }
        Collections.reverse(additions);

        System.out.println("Additions: ");
        for (String add : additions) {
            System.out.println(" + " + add);
        }

        System.out.println("Final order: " + product.getDescription());
    }
}
