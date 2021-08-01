package inherit_geometric;

public class Rectangle extends GeometricObject {
    private double width = 0;
    private double height = 0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    public void printRectangle() {
        System.out.println("ចតុកោណកែងមាន ទទឹង " + width + " កំពស់ " + height +
                " ក្រឡាផ្ទៃ " + getArea() + " បរិមាត្រ " + getPerimeter() + toString());
    }
}
