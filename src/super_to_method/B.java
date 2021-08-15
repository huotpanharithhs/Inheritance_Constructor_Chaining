package super_to_method;

public class B extends A {
    public B() {
        super(1);
        super.showMessage();
        showMessage();
    }

    public void showMessage() {
        System.out.println("Message B.");
    }
}
