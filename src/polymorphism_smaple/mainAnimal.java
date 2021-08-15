package polymorphism_smaple;

public class mainAnimal {
    public static void main(String[] args) {
        Animal obj1 = new Dogs();
        Animal obj2 = new Cats();
        Animal obj3 = new Pigs();
        Animal obj4 = new Birds();

        System.out.println(obj1.animalSound());
        System.out.println(obj3.animalSound());
    }
}
