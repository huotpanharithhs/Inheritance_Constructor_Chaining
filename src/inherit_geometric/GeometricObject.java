package inherit_geometric;

import java.util.Date;

public class GeometricObject {
    private String color = "White";
    private boolean filled = true;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
        System.out.println("Class Geometric.");
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
        System.out.println("Class Geometric constructor have parameter.");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "រូបកើតឡើងនៅ " + dateCreated + " ពណ៌ " + color + " បំពេញពណ៌ " + filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}
