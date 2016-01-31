package abstract_factory.pattern;



/**
 * Created by Levon on 1/31/2016, 8:51 PM
 */
public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("Red"))
            return new Red();
        else if(color.equalsIgnoreCase("Green"))
            return new Green();
        else if(color.equalsIgnoreCase("Blue"))
            return new Blue();

        return null;
    }

    public Shape getShape(String shapeType){

        return null;
    }
}
