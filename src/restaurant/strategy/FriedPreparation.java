package restaurant.strategy;

import restaurant.factory.Product;

public class FriedPreparation implements PreparationStrategy {
    @Override
    public void prepare(Product product) {
        System.out.println(product.getDescription()+"preparing by frying.");
    }
    @Override
    public void modifyCalories(Product product) {
        System.out.println("Fried" + product.getDescription() + "calories" + product.getCalories() * 1.3);
    }
}
