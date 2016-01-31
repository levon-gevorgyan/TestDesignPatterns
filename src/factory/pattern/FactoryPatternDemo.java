package factory.pattern;

/**
 * Created by Levon on 1/31/2016, 8:55 PM
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("square");
        shape3.draw();
    }
}
