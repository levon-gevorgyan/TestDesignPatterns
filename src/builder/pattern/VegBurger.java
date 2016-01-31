package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:32 PM
 * 4.Create concrete classes extending Burger and ColdDrink classes
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
