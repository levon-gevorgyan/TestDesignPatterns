package builder.pattern;

/**
 * Created by Levon on 1/31/2016, 10:13 PM
 * 1.Create an interface Item representing food item and packing.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
