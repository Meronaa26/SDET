package seleniumReview.day12_actions_upload_jsExcutor;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 1)
    public void singleton_understanding(){
        String str1= Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2= Singleton.getWord();
        System.out.println("str2 = " + str2);
    }

    @Test(priority = 2)
    public void singleton_understanding2() {

        String str4 = Singleton.getWord();
        System.out.println("str1 = " + str4);
    }
}
