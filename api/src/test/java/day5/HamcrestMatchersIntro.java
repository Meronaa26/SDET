package day5;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersIntro {

    @Test
    public void simpleTest(){
        assertThat(5+5, is(10));
        assertThat(5+5,equalTo(10));
        //matcher has 2 overloaded value
        //second that accept another matchers
        //below example is method accepting another matcher equal to make it readable
        assertThat(5+5,is(equalTo(10)));

        assertThat(5+5, not(9));
        assertThat(5+5, is(not(80)));
        assertThat(5+5, is(not(equalTo(199))));


        //number comparison
        assertThat(5+5,is(greaterThan(9)));


    }

    @DisplayName("Assertion with String")
    @Test
    public void test2(){


        String text ="B10 IS Learning Hamcrest";

        assertThat(text, is("B10 IS Learning Hamcrest"));
        assertThat(text, equalTo("B10 IS Learning Hamcrest"));
        assertThat(text, is(equalTo("B10 IS Learning Hamcrest")));

        //starts with
        assertThat(text,startsWith("B10"));
        //case insensitive
        assertThat(text,startsWithIgnoringCase("b10"));
        //endswith
        assertThat(text,endsWith("Hamcrest"));
        //contains
        assertThat(text,containsString("Learning"));



        String str= " ";

        //check String is blank
        assertThat(str,blankString());

        //empty String
        assertThat(str.trim(),emptyString());



    }
@DisplayName("Hamcrest for collection")
    @Test
    public void testCollections(){

        List<Integer>listOfIntegers= Arrays.asList(1,4,5,6,32,45,67,89,99,23);
        //check the size of list
        assertThat(listOfIntegers , Matchers.<Integer>hasSize(10));
        //check if this list hasItem 67

        assertThat(listOfIntegers , hasItem(67));
        //check if this list hasItems
        assertThat(listOfIntegers , hasItems(67,5,89));

        //check if all items are greater than 0
    assertThat(listOfIntegers ,everyItem(greaterThan(0)));


}

}
