package restaurant.strategy;

import restaurant.factory.Product;

public class FriedPreparation implements PreparationStrategy {
    @Override
    public void prepare(Product product) {
        System.out.println(product.getDescription()+"preparing by frying.");
    }
}
