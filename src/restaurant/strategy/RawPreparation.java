package restaurant.strategy;

import restaurant.factory.Product;

public class RawPreparation implements PreparationStrategy{
    @Override
    public void prepare(Product product) {
        System.out.println("Classic"+product.getDescription()+ "is preparing.");
    }
}
