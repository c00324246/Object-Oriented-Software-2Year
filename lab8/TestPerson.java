package lab8;

public class TestPerson {

    public static void main(String[] args) {

        // Create Person array
        Person[] people = new Person[2];

        // Add Employee and Student
        people[0] = new Employee("John", 45000);
        people[1] = new Student("Olga", "Computer Science");

        // Print information
        for (int i = 0; i < people.length; i++) {

            System.out.println("Name: " + people[i].getName());

            System.out.println("Description: " +
                    people[i].getDescription());

            System.out.println();
        }
    }
}
