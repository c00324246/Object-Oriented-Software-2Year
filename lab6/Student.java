
package lab6;

public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;

    // Constructor
    public Student(String name, String address) {
        super(name, address);

        numCourses = 0;
        courses = new String[10];
        grades = new int[10];
    }

    // toString
    public String toString() {

        String result = "Student: " + super.toString();

        for (int i = 0; i < numCourses; i++) {
            result += " " + courses[i] + ":" + grades[i];
        }

        return result;
    }

    // Add course and grade
    public void addCourseGrade(String course, int grade) {

        courses[numCourses] = course;
        grades[numCourses] = grade;

        numCourses++;
    }

    // Print grades
    public void printGrades() {

        System.out.println(this);
    }

    // Calculate average grade
    public double getAverageGrade() {

        if (numCourses == 0) {
            return 0.0;
        }

        int total = 0;

        for (int i = 0; i < numCourses; i++) {
            total += grades[i];
        }

        return (double) total / numCourses;
    }
}
