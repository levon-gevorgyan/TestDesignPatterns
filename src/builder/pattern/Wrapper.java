package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:16 PM
 * 2.Create concrete classes implementing the Packing interface.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
