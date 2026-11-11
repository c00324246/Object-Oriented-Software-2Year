
public class Address {

    private String street;
    private String city;
    private String county;

    // Constructor
    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }

    // toString method
    public String toString() {
        return street + ", " + city + ", " + county;
    }
}
