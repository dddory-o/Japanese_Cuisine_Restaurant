package restaurant.observer;
import restaurant.decorator.ProductDecorator;
import restaurant.factory.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerObserver implements Observer {
    @Override
    public void update(Product product) {
        String customerName = "Customer";
        System.out.println(customerName + ": Your order");
        Product original = product;
        while (original instanceof ProductDecorator dec) {
            original = dec.getWrappedProduct();
        }

        System.out.println(":" + original.getDescription());

        Product current = product;
        List<String> additions = new ArrayList<>();

        while (current instanceof ProductDecorator dec) {
            additions.add(dec.getOwnAddition());
            current = dec.getWrappedProduct();
        }

        // добавки в правильном порядке
        Collections.reverse(additions);

        System.out.println("Added:");
        for (String add : additions) {
            System.out.println(" + " + add);
        }

        System.out.println("Final order: " + product.getDescription());
    }

}
