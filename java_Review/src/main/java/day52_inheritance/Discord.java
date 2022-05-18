package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone){
        System.out.println("Chatting on Discord with " + someone);
    }

    @Override
    protected boolean download() {
        System.out.println("Downloaded Discord version 0.0.23 from App store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Abrehwa");
    }
}
