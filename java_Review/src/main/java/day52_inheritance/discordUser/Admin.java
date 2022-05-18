package day52_inheritance.discordUser;

public class Admin extends User{

    public Admin() {
        super();   // call super class /user class no args constructor
        System.out.println("Admin constructor");
    }

    public Admin( String name,int id){
        super("Admin",name, id);
        System.out.println("Admin 2 arg constructor ");

    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
