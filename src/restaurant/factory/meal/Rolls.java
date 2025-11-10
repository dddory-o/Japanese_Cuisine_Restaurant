package restaurant.factory.meal;

public class Rolls implements Meal {
    public String getDescription(){
        return "Rolls";
    }
    public double getCost(){
        return 3000;
    }
    public int getQuantity(){
        return 8;
    }
    public int getCalories(){
        return 900;
    }
}
