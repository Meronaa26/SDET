package day48_Constructors_static;

import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {
        Group b10=new Group("B10");
        System.out.println("b10.getMembers() = " + b10.getMembers().size());

        b10.addMember("Meron");
        b10.addMember("Abrehet");
        b10.addMember("Lwam");
        b10.addMember("Titi");
        b10.addMember("Albert");
        b10.addMember("Rasa");

        System.out.println("b10.getMembers() = " + b10.getMembers());
        System.out.println("b10.getMembers().size() = " + b10.getMembers().size());

        b10.removeMember("Rasa");
        System.out.println("b10 = " + b10);

        Group d2=new Group("Developers");
        d2.setMembers(Arrays.asList("Meron", "Abrehwa", "Titi"));
        System.out.println("d2.getMembers() = " + d2.getMembers());
//        d2.removeMember("Titi");
//        System.out.println("d2 = " + d2);   throws unsupported exception

        if(d2.getMembers().contains("Meron888")){
           System.out.println("She is a member");
       }else{
           System.out.println("she is not a member");
       }




    }
}
