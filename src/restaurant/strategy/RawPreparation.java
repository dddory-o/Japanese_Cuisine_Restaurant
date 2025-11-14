package restaurant.strategy;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;

public class RawPreparation implements PreparationStrategy{
    @Override
    public void prepare(Product product) {
        System.out.println("Classic"+product.getDescription()+ "is preparing.");
    }
    @Override
    public void modifyCalories(Product product) {
        System.out.println("Classic" + product.getDescription() + "calories" + product.getCalories());
    }
}
