package inherit_geometric;

import java.util.Scanner;

public class MainGeometric extends Object {
    public static void main(String[] args) {
        displayObjectGeometric(new Circle(1.7));
        displayObjectGeometric(new Rectangle(1.2,4.6));
        displayObjectGeometric(new GeometricObject());
    }

    private static void displayObjectGeometric(GeometricObject geometricObject) {
        System.out.println("Date Created : " + geometricObject.getDateCreated() + " Color =" + geometricObject.getColor() +
                " IsFilled ="+geometricObject.isFilled() + " Area = " + geometricObject.getArea() +
                " Perimeter = "+ geometricObject.getPerimeter());
    }
}
