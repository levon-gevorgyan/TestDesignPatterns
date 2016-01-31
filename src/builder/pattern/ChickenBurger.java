package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:34 PM
 * 4.Create concrete classes extending Burger and ColdDrink classes
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
