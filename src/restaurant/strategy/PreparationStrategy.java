package restaurant.strategy;

import restaurant.factory.Product;

public interface PreparationStrategy {
    void prepare(Product product);
}
