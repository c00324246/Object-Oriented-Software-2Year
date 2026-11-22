package lab8;

public abstract class Person {

    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Abstract method
    public abstract String getDescription();
}
