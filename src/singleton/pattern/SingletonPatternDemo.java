package singleton.pattern;

/**
 * Created by Levon on 1/31/2016, 9:57 PM
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();

        object.showMessage();
    }
}
