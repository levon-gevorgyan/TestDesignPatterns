package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:50 PM
 * 7.BuiderPatternDemo uses MealBuider to demonstrate builder pattern.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();

        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total: " + vegMeal.getCost());

        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNonVeg Meal");
        nonVegMeal.showItems();
        System.out.println("Total: "+nonVegMeal.getCost());
    }
}
