package inherit_geometric;

public class Rectangle extends GeometricObject {
    private double width = 0;
    private double height = 0;

    public Rectangle() {
        System.out.println("Class Rectangle.");
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Class Rectangle.");
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString()+"Area =" + getArea() + "Perimeter = " + getPerimeter();
    }
}
