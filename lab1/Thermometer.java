public class Thermometer {
    private double celsius;

    public Thermometer() {
        setCelsius(0);
    }

    public Thermometer(double cel) {
        setCelsius(cel);
    }

    public void setCelsius(double cel) {
        celsius = cel;
    }

    public double getCelsius() {
        return celsius;
    }
}
