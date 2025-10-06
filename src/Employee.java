package employee;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Abstract method for role-specific raise
    public abstract void giveRaise();

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ") - $" + salary;
    }
}
