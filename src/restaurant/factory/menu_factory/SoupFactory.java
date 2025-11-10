package restaurant.factory.menu_factory;

import restaurant.factory.soup.Soup;

public interface SoupFactory {
    Soup createSoup(String description);
}
