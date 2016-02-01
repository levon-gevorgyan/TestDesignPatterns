package prototype.pattern;

import java.util.Hashtable;

/**
 * Created by Levon on 2/1/2016, 8:34 PM
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape=shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square=new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }
}
