package day56_abstraction;

public class GreetingAction {
    public static void main(String[] args) {
        MountainLanguage mountainLanguage= new MountainLanguage();
        mountainLanguage.bye();
        mountainLanguage.hi();


        Japanese japanese= new Japanese();
        japanese.bye();
        japanese.hi();
    }
}
