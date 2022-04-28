package seleniumReview.day8_Windows_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1(){
        Faker faker= new Faker();
        String fullName= faker.name().fullName();
        System.out.println(fullName);
        String firstName= faker.name().firstName();
        System.out.println(firstName);
        String chuckNorris= faker.chuckNorris().fact();  //printing random sentences
        System.out.println(chuckNorris);
    }
}
