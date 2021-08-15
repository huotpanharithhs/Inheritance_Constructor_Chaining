package overriding_method;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Method toString for person object";
    }
}
class Student extends Person{
    private int studentId;
    public Student(String name) {
        super(name);
    }

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String toString(){
        return "Method toString for Student object."+ super.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Student("panha",01).toString());
        System.out.println(new Person("panha").toString());
    }
}
