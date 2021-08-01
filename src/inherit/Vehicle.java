package inherit;

public class Vehicle {
    private String brand = "Ford";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void sound(){
        System.out.println("Tut,tuut");
    }
}
