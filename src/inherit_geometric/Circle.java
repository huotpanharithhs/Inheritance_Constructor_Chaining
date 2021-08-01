package inherit_geometric;

public class Circle extends GeometricObject {
    private double radius = 0;

    public Circle() {
        super("Blue",true);
        System.out.println("Class Circle.");
    }

    public Circle(double radius) {
        this.radius = radius;
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

    public void printCircle() {
        System.out.println("រង្វង់មានកាំស្មើ " + radius + " ក្រឡាផ្ទៃរង្វង់ស្មើ " + getArea() +
                " បរិមាត្ររង្វង់ស្មើ " + getPerimeter() + " អង្កត់ផ្ចិត " + getDiameter() + toString());
    }
}
