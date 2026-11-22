package lab8;

public class Employee extends Person {

    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // getDescription
    public String getDescription() {
        return "An employee with a salary of " + salary;
    }

}
