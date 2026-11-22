
package lab7;

public class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name);
    }

    public String toString() {
        return "Cat: " + super.toString();
    }
}
