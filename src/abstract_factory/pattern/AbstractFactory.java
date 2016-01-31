package abstract_factory.pattern;

/**
 * Created by Levon on 1/31/2016, 9:14 PM
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
