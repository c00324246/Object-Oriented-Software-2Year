
package lab6;

public class Teacher extends Person {

    private int numCourses;
    private String[] courses;

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);

        numCourses = 0;
        courses = new String[10];
    }

    // toString
    public String toString() {

        return "Teacher: " + super.toString();
    }

    // Add course
    public boolean addCourse(String course) {

        for (int i = 0; i < numCourses; i++) {

            if (courses[i].equals(course)) {
                return false;
            }
        }

        if (numCourses < courses.length) {

            courses[numCourses] = course;
            numCourses++;

            return true;
        }

        return false;
    }

    // Remove course
    public boolean removeCourse(String course) {

        for (int i = 0; i < numCourses; i++) {

            if (courses[i].equals(course)) {

                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }

                numCourses--;
                courses[numCourses] = null;

                return true;
            }
        }

        return false;
    }
}
