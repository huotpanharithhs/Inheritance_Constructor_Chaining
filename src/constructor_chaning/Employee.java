package constructor_chaning;

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
        showMessage("Invoke method showMessage by super reference.");
    }

    public Employee(String s) {
        super();
        System.out.println(s);
    }

    public void showMessage(String s) {
        System.out.println("Invoke message by super reference.");
    }
}