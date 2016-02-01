package bridge.pattern;

/**
 * Created by Levon on 2/1/2016, 11:01 PM
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();
}
