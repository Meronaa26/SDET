package day52_inheritance.discordUser;

public class B10DiscordServer {

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.setName("Meron");
        admin.setRole("SDET");
        admin.setId(456);


        User user= new User();
        user.setName("helen");
        user.setId(1234);
        user.setRole("Customer");

        System.out.println("admin.toString() = " + admin.toString());
        System.out.println("user.toString() = " + user.toString());


        Admin admin1= new Admin("AdminMeron" , 4555);
        System.out.println(admin1);
    }
}
