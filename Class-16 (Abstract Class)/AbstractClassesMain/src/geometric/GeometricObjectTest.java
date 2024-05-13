package geometric;

import java.util.Date;

/**
 * @author MD KUTUB UDDIN
 */
public abstract class GeometricObjectTest {

    private String color = "Red";
    private boolean filled;
    private Date dateCreDate;

    public GeometricObjectTest() {
        this.dateCreDate = new Date();
    }

    public GeometricObjectTest(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.dateCreDate = new Date();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreDate() {
        return dateCreDate;
    }

    public void setDateCreDate(Date dateCreDate) {
        this.dateCreDate = dateCreDate;
    }

    public abstract double getArea();

    public abstract double getRectangle();

}
