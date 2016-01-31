package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:46 PM
 * 6.Create a MealBuilder class, the actual builder class responsible to create Meal objects
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
