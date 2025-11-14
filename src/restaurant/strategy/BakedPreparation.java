package restaurant.strategy;

import restaurant.factory.Product;

public class BakedPreparation implements PreparationStrategy{
    @Override
    public void prepare(Product product) {
        System.out.println(product.getDescription()+"preparing by baking.");
    }
    @Override
    public void modifyCalories(Product product) {
        System.out.println("Baked" + product.getDescription() + "calories" + product.getCalories() * 1.1);
    }
}

