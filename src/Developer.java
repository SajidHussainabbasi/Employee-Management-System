package employee;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveRaise() {
        // Developers get a 10% raise
        salary *= 1.10;
    }
}
