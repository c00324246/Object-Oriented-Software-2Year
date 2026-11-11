
public class Employee {

    private static int nextEmployeeNumber = 1000;
    private static int numberOfEmployees = 0;

    private int employeeNumber;
    private String name;
    private String employeeType;
    private Address address;
    private String companyCar;
    private Office office;

    // Constructor
    public Employee(String name, Address address,
            String employeeType, String companyCar,
            Office office) {

        employeeNumber = nextEmployeeNumber;
        nextEmployeeNumber++;

        numberOfEmployees++;

        this.name = name;
        this.address = address;
        this.employeeType = employeeType;
        this.companyCar = companyCar;
        this.office = office;
    }

    // Get employee number
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // Get number of employee records
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Get office
    public Office getOffice() {
        return office;
    }

    // toString method
    public String toString() {

        String result = "Employee Number: " + employeeNumber
                + "\nName: " + name
                + "\nType: " + employeeType
                + "\nAddress: " + address
                + "\nOffice Number: " + office.getOfficeNumber();

        if (employeeType.equalsIgnoreCase("Manager")) {
            result += "\nCompany Car: " + companyCar;
        }

        return result;
    }
}
