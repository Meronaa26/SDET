package day47_Constructors;

public class Address {

    private String street;
    private String city;
    private String  state;
    private String zipCode;
    private String country= "USA";

    public Address(){
        System.out.println("Address constructor ");
        state="NY";
        street="Kehaweta";
        zipCode="Godenan Harenet";
    }

    public Address(String street, String state, String city, String country, String zipCode){
        setStreet(street);
        setCountry(country);
        setState(state);
        setCity(city);
        setZipCode(zipCode);
        //this.city=city;

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
