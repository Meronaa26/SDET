package seleniumReview.day12_actions_upload_jsExcutor;

public class Singleton {

    private Singleton() {} // private constructor

    private static String word; // getting access to the private constructor

    public static String getWord(){
        if(word==null){
            System.out.println("First time call .. Word object is null");
            word="something";
        }else{
            System.out.println("word already has a value");
        }
        return word;
    }
}
