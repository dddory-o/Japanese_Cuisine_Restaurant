package restaurant.factory.menu_factory;

import restaurant.factory.soup.Kuksi;
import restaurant.factory.soup.MisoSoup;
import restaurant.factory.soup.Ramen;
import restaurant.factory.soup.Soup;

public class SoupFactoryImpl implements SoupFactory {
    @Override
    public Soup createSoup(String description) {
        return switch (description.toLowerCase()){
            case "ramen" -> new Ramen();
            case "miso soup" -> new MisoSoup();
            case "kuksi" -> new Kuksi();
            default -> null;
        };
    }
}
