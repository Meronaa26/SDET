package day53_inheritance.Final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);

     //   TestData.ADMIN_USERNAME="CHANGE" it will gave us error brecause it is final we can't change it'

        final int SSN=435678888;

    }
}
