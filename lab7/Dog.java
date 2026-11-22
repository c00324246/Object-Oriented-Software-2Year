
package lab7;

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name);
    }

    public String toString() {
        return "Dog: " + super.toString();
    }

}
