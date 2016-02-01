package prototype.pattern;

/**
 * Created by Levon on 2/1/2016, 8:43 PM
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1=(Shape)ShapeCache.getShape("1");
        System.out.println(clonedShape1.getType());

        Shape clonedShape2=(Shape)ShapeCache.getShape("2");
        System.out.println(clonedShape2.getType());

        Shape clonedShape3=(Shape)ShapeCache.getShape("3");
        System.out.println(clonedShape3.getType());


    }
}
