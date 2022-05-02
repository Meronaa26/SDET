package day39_Wrappers;

public class WrapperClassMethod {

    public static void main(String[] args) {
        System.out.println("Integer.max(10,5) = " + Integer.max(10, 5));
        System.out.println("Integer.sum(56,78) = " + Integer.sum(56, 78));
        System.out.println("Integer.min(567,8645) = " + Integer.min(567, 8645));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);


        System.out.println("Double.max(567.5,798.8) = " + Double.max(567.5, 798.8));
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.compare(456,678) = " + Double.compare(456, 678)); // -1 second number is greater than the first one // 1 is the first on is greater

        System.out.println("Character.isDigit(8) = " + Character.isDigit(8));
        System.out.println("Character.isDigit('b') = " + Character.isDigit('b'));
        System.out.println("Character.isAlphabetic('t') = " + Character.isAlphabetic('t'));
        System.out.println("Character.isLetter(9) = " + Character.isLetter(9));
       //System.out.println("Character.charCount(\"uyyyy\") = " + Character.charCount('T')) ;//;I don't know what is this

        System.out.println("Character.isLowerCase('u') = " + Character.isLowerCase('u'));

        char letter='a';
        if(Character.isUpperCase(letter)){
            System.out.println("It is upper case");
        }
        String word= "JaVa iS Fun";



        for (int i = 0; i < word.length()-1; i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }}

        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);



        String total="450";

        int strToInt= Integer.parseInt(total);
        System.out.println("strToInt = " + strToInt);

        double db1=Double.parseDouble(total);
        System.out.println("db1 = " + db1);

        String strPrice="123.56";
        double db4=Double.valueOf(strPrice);
       if(db4>100){
           System.out.println("Price is expensive");
       }else{
           System.out.println("It isn't expensive");
       }




       String sentence= "I WROTE 857 LINES OF CODE";
       String [] words=sentence.split(" ");
       int linesOfCodes=Integer.parseInt(words[2]);
        System.out.println("linesOfCodes = " + linesOfCodes);
    }
}
