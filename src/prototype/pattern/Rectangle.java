package prototype.pattern;

/**
 * Created by Levon on 2/1/2016, 8:29 PM
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
