package day48_Constructors_static;

public class Customer {

    public Customer() {
        System.out.println("No arg Constructor");
        name=" New customer";
        id=-1;
    }

    public Customer( String name, int  id) {
        this.name=name;  // we can use to setName(name)
        this.id=id; //setId(id)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
