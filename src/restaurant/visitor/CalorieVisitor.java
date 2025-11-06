package restaurant.visitor;

import restaurant.factory.Meal;

public class CalorieVisitor implements MealVisitor {
    private int totalCalories = 0;

    @Override
    public void visit (Meal meal) {
        String description = meal.getDescription().toLowerCase();
        if (description.contains("sushi")){
            totalCalories += 300;
        }
        if (description.contains("rolls")){
            totalCalories += 250;
        }
        if (description.contains("sushiburger")){
            totalCalories += 750;
        }
        if (description.contains("soysauce")){
            totalCalories += 10;
        }
        if (description.contains("ginger")){
            totalCalories += 20;
        }
        if (description.contains("unagi")){
            totalCalories += 40;
        }
    }

    @Override
    public int getTotalCalories(){
        return totalCalories;
    }
}
