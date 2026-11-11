
import java.util.Scanner;

public class MyHR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create three offices automatically
        Office[] offices = new Office[3];

        for (int i = 0; i < offices.length; i++) {
            offices[i] = new Office();
        }

        int choice;

        do {

            System.out.println("\n===== MY HR SYSTEM =====");
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {

                case 1:

                    System.out.println("\n===== OFFICES =====");

                    for (Office office : offices) {
                        System.out.println(office);

                        System.out.println(
                                office.getEmployeeRecords());
                    }

                    break;

                case 2:

                    if (Employee.getNumberOfEmployees() >= 5) {
                        System.out.println(
                                "Maximum of 5 employees reached.");
                        break;
                    }

                    System.out.print("Enter employee name: ");
                    String name = input.nextLine();

                    System.out.print("Enter street: ");
                    String street = input.nextLine();

                    System.out.print("Enter city/town: ");
                    String city = input.nextLine();

                    System.out.print("Enter county: ");
                    String county = input.nextLine();

                    Address address = new Address(street, city, county);

                    String type;

                    while (true) {

                        System.out.print(
                                "Enter employee type (Staff/Manager): ");

                        type = input.nextLine();

                        if (type.equalsIgnoreCase("Staff") ||
                                type.equalsIgnoreCase("Manager")) {
                            break;
                        }

                        System.out.println(
                                "Please enter Staff or Manager.");
                    }

                    String car = "";

                    if (type.equalsIgnoreCase("Manager")) {

                        System.out.print(
                                "Enter company car details: ");

                        car = input.nextLine();
                    }

                    // Display available offices
                    System.out.println("\nAvailable offices:");

                    for (Office office : offices) {

                        if (office.getNumberOfEmployees() < 2) {
                            System.out.println(office);
                        }
                    }

                    System.out.print(
                            "Enter office number: ");

                    int officeNumber = Integer.parseInt(input.nextLine());

                    Office selectedOffice = null;

                    for (Office office : offices) {

                        if (office.getOfficeNumber() == officeNumber) {
                            selectedOffice = office;
                            break;
                        }
                    }

                    if (selectedOffice == null) {

                        System.out.println("Invalid office number.");

                    } else if (selectedOffice.getNumberOfEmployees() >= 2) {

                        System.out.println("Office is full.");

                    } else {

                        Employee employee = new Employee(
                                name,
                                address,
                                type,
                                car,
                                selectedOffice);

                        selectedOffice.addEmployee(employee);

                        System.out.println(
                                "Employee created successfully!");

                        System.out.println(employee);
                    }

                    break;

                case 3:

                    System.out.println("\n===== ALL EMPLOYEES =====");

                    if (Employee.getNumberOfEmployees() == 0) {

                        System.out.println("No employees found.");

                    } else {

                        for (Office office : offices) {

                            System.out.println(
                                    office.getEmployeeRecords());
                        }
                    }

                    break;

                case 0:

                    System.out.println("Exiting MyHR System.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }
}
