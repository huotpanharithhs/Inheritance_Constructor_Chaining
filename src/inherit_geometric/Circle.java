package inherit_geometric;

public class Circle extends GeometricObject {
    private double radius = 0;

    public Circle() {
        super("Blue",true);
        System.out.println("Class Circle.");
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Class Circle.");
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString()+ "អង្កត់ផ្ចិត = "+ getDiameter() + "Area = "+getArea() + "Perimeter = "+ getPerimeter() ;
    }
}
