package day52_inheritance;

public class MobileApp {
   private  String name;
   private  int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void useTheApp(int minutes){

        System.out.println("Using "  + name + " app for  " + minutes + " minutes");
    }
    protected boolean download(){
        System.out.println("App : " +name + " version : "+ version + "  is downloading");
        return true;
    }
}
