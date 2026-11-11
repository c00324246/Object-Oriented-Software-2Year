
public class Office {

    private static int nextOfficeNumber = 100;

    private int officeNumber;

    private Employee[] employees = new Employee[2];

    private int numberOfEmployees = 0;

    // Constructor
    public Office() {
        officeNumber = nextOfficeNumber;
        nextOfficeNumber++;
    }

    // Get office number
    public int getOfficeNumber() {
        return officeNumber;
    }

    // Add employee to office
    public boolean addEmployee(Employee employee) {

        if (numberOfEmployees < 2) {
            employees[numberOfEmployees] = employee;
            numberOfEmployees++;
            return true;
        }

        return false;
    }

    // Return number of employees
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Return employee records
    public String getEmployeeRecords() {

        String result = "";

        for (int i = 0; i < numberOfEmployees; i++) {
            result += employees[i].toString() + "\n";
        }

        return result;
    }

    // toString method
    public String toString() {

        return "Office Number: " + officeNumber
                + " | Employees: " + numberOfEmployees + "/2";
    }
}
