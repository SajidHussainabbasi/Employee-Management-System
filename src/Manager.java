package employee;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveRaise() {
        // Managers get a 15% raise
        salary *= 1.15;
    }
}