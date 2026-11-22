
package lab7;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex");

        Cat cat = new Cat("Mittens");

        Vet vet = new Vet("John");

        vet.vaccinate(dog);

        vet.vaccinate(cat);
    }
}
