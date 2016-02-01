package prototype.pattern;

/**
 * Created by Levon on 2/1/2016, 8:31 PM
 */
public class Circle extends Shape {
    public Circle() {
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }
}
