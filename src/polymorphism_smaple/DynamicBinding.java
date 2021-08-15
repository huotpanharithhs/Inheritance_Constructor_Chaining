package polymorphism_smaple;

class Person1 extends Object{
    public String toString(){
        return "Person";
    }
}

class Student1 extends Person1{
    @Override
    public String toString() {
        return "Students";
    }
}

class GraduateStudents extends Student1{
    @Override
    public String toString() {
        return "Graduate Students";
    }
}


public class DynamicBinding {
    public static void main(String[] args) {
        Object person = new Person1();
        Object student = new Student1();
        Object graduate = new GraduateStudents();
        Object object = new Object();
        displayObject(person);
        displayObject(graduate);
        displayObject(student);
        displayObject(object);
    }

    public static void displayObject(Object obj){
        System.out.println(obj.toString());
    }
}
