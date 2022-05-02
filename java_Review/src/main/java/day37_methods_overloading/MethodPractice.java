package day37_methods_overloading;

public class MethodPractice {

    public static void main(String[] args) {
        System.out.println("repeatString(\"Meron\", 4,'|') = " + repeatString("Meron", 4,'|'));
        System.out.println("repeatStringV2(\"Yes I can do it\" ,2,'-') = " + repeatStringV2("Yes I can do it", 2, '-'));
    }
    
    
    
    public static String repeatString(String world, int times, char  delimiter){

        String result="";
        for (int i = 1; i <=times; i++) {
           result+=world+delimiter;
        }
        
       return result;
        
    }

    public static String repeatStringV2(String world, int times, char  delimiter){

        String result="";
        for (int i = 1; i <=times; i++) {
            if(i == times){
                 result+=world;  // I am saying in here if it is the last item in the loop just add only the word
            }else {
                result += world + delimiter;
            }
        }

        return result;

    }
}
