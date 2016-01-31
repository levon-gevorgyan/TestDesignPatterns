package singleton.pattern;

/**
 * Created by Levon on 1/31/2016, 9:51 PM
 */
public class SingleObject {

    private static SingleObject instance=new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("singleton");
    }
}
