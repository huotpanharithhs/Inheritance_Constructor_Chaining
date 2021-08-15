package constructor_chaning;

public class Faculty extends Employee {
    public Faculty() {
        super();
        System.out.println("(4) Performs Faculty's tasks");
        super.showMessage("Testing");
    }
}


