package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp= new MobileApp();
        mobileApp.setName("Instagram");
        mobileApp.useTheApp(3);
        mobileApp.download();

        Instagram instagram= new Instagram();
        instagram.setName("Meronaa26");
        instagram.useTheApp(9);
        instagram.download();

        Discord discord = new Discord();
        //discord.chat("abiti");
        discord.setName("Discord");
        discord.useTheApp(5);
        discord.download();



    }
}
