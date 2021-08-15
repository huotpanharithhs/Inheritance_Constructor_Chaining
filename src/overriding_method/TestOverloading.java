package overriding_method;
class B {
    public void p(double i){
        System.out.println(i*2);
    }
}
class A extends B{
    public void p(int i){
        System.out.println(i);
    }
}
public class TestOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.p(10);
        obj.p(10.0);
    }
}
