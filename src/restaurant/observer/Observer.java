package restaurant.observer;

import restaurant.factory.Product;

public interface Observer {
    void update(Product product);
}
