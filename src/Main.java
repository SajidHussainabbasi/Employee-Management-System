/* Employee Management System 🏢
   Description: Abstract class: Employee (fields: name, salary)
   Subclasses: Developer, Manager Store all employees in a List<Employee>
   Methods: printPayroll(), giveRaise(), listManagers()
   Features: Display all employees Give raises based on role Print total company payroll
*/

package employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add some employees
        employees.add(new Developer("Alice", 70000));
        employees.add(new Manager("Bob", 90000));
        employees.add(new Developer("Charlie", 75000));
        employees.add(new Manager("Diana", 95000));

        // Display all employees
        System.out.println("=== Employee List ===");
        employees.forEach(System.out::println);

        // Give raises
        System.out.println("\n=== Giving Raises ===");
        for (Employee e : employees) {
            e.giveRaise();
            System.out.println(e.getName() + " new salary: $" + e.getSalary());
        }

        // Print total payroll
        System.out.println("\n=== Total Company Payroll ===");
        double totalPayroll = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total payroll: $" + totalPayroll);

        // List only managers
        System.out.println("\n=== Managers ===");
        employees.stream()
                .filter(e -> e instanceof Manager)
                .forEach(System.out::println);
    }
}