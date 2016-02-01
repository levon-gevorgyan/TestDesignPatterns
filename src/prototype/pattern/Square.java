package prototype.pattern;

/**
 * Created by Levon on 2/1/2016, 8:30 PM
 */
public class Square extends Shape {

    public Square() {
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
