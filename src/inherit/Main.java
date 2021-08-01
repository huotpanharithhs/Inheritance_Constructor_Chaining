package inherit;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.getBrand() );
        System.out.println(myCar.getModelName());
        myCar.sound();
    }
}
