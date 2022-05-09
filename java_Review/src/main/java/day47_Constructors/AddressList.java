package day47_Constructors;

public class AddressList {

    public static void main(String[] args) {
        Address address= new Address();
        address.setCity("Seattle");
        address.setState("WA");
        address.setZipCode("98056");
        address.setStreet("3811,NE 3RD CT");

        System.out.println("address = " + address);

        Address newAddress=new Address();
        System.out.println(newAddress);

        Address asmera= new Address("Godaif", "Maekel", "Asmera", "Eritrea", "Yeblenan");
        System.out.println("asmera = " + asmera);
    }
}
