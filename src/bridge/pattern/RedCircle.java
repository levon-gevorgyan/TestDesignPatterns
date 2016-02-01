package bridge.pattern;

/**
 * Created by Levon on 2/1/2016, 10:53 PM
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red"+radius+x+y);
    }
}
