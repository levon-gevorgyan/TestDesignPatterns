package abstract_factory.pattern;



/**
 * Created by Levon on 1/31/2016, 8:51 PM
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();

        return null;
    }
}
