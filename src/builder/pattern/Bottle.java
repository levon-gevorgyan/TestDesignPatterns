package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:19 PM
 * 2.Create concrete classes implementing the Packing interface.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
