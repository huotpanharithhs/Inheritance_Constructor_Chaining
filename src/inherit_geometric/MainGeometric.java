package inherit_geometric;

public class MainGeometric extends Object {
    public static void main(String[] args) {
//        displayObjectGeometric(new Circle(1.7));
//        displayObjectGeometric(new Rectangle(1.2,4.6));
//        displayObjectGeometric(new GeometricObject());
        displayAreaOfObject(new Circle(1.6));
        displayAreaOfObject(new Rectangle(2,4));
    }

    private static void displayAreaOfObject(Object object){
        if(object instanceof Circle){
            System.out.println("Circle Area = " + ((Circle)object).getArea());
        }
        if(object instanceof Rectangle){
            System.out.println("Rectangle Area = "+ ((Rectangle)object).getArea());
        }
    }


    private static void displayObjectGeometric(GeometricObject geometricObject) {
        System.out.println("Date Created : " + geometricObject.getDateCreated() + " Color =" + geometricObject.getColor() +
                " IsFilled ="+geometricObject.isFilled() + " Area = " + geometricObject.getArea() +
                " Perimeter = "+ geometricObject.getPerimeter());
    }


}
