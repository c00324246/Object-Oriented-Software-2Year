public class ThermTest {
    public static void main(String[] args) {
        Thermometer thermA = new Thermometer();
        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());

        thermA.setCelsius(20.0);
        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());

        Thermometer thermB = new Thermometer(10.0);
        double tempB = thermB.getCelsius();
        System.out.println("Temp. of Thermometer B is " + tempB);
    }
}
