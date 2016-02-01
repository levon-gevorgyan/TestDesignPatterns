package prototype.pattern;

/**
 * Created by Levon on 2/1/2016, 8:21 PM
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {

        return type;
    }

    public String getId() {
        return id;
    }

    public Object clone(){
        Object clone=null;

        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
