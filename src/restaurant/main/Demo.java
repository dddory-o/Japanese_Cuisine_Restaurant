package restaurant.main;

import restaurant.facade.RestaurantFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    private final RestaurantFacade facade;
    private final Scanner scanner;

    public Demo() {
        this.facade = new RestaurantFacade();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\n==== jAPANESE CUISINE RESTAUSANT====");
            System.out.println("1. Show menu");
            System.out.println("2. Place order");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            String option = scanner.nextLine().trim();

            switch (option) {
                case "1" -> facade.showMenu();
                case "2" -> handlePlaceOrder();
                case "3" -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Unknown option, try again.");
            }
        }

        scanner.close();
    }

    private void handlePlaceOrder() {
        System.out.println("\n--- Place Order ---");
        System.out.print("Enter meal (Sushi / Rolls / SushiBurger): ");
        String meal = scanner.nextLine().trim();

        System.out.print("Enter soup (Ramen / Kuksi / MisoSoup): ");
        String soup = scanner.nextLine().trim();

        System.out.print("Enter drink (Coke / Sprite / Fanta): ");
        String drink = scanner.nextLine().trim();

        System.out.print("Enter preparation (raw / fried / baked): ");
        String preparation = scanner.nextLine().trim();

        List<String> additions = new ArrayList<>();
        System.out.println("Additions (type name and press Enter; empty line to finish). Options: Chopsticks, SoySauce, Wasabi, Bread");
        while (true) {
            System.out.print("Addition (or empty to finish): ");
            String add = scanner.nextLine().trim();
            if (add.isEmpty()) break;
            additions.add(add);
        }

        facade.placeOrder(meal, soup, drink, preparation, additions);

    }

    public static void demoRun() {
        new Demo().run();
    }
}
