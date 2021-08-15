package casting;

public class TestCasting {
    public static void main(String[] args) {
       Object obj = new Object();
       obj = new Students();
        Students students;
        students = (Students)obj;
        System.out.println(obj.toString());
    }
}
class Students extends Object{
    @Override
    public String toString() {
        return "This is object students";
    }
}