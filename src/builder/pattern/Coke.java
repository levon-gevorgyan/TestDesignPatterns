package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:35 PM
 * 4.Create concrete classes extending Burger and ColdDrink classes
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
