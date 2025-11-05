package restaurant.factory;

public class SushiBurger implements Meal{
    public String getName(){
        return "SushiBurger";
    }
    public String getDescription(){
        return "Crispy breading, delicate cream cheese, fresh avocado, and lightly salted fish.1 piece";
    }

    public double getCost(){
        return 2000;
    }
}
