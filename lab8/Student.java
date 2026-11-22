package lab8;

public class Student extends Person {

    private String course;

    // Constructor
    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    // getDescription
    public String getDescription() {
        return "A student studying " + course;
    }
}
