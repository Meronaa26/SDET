package day45_OOP;

public class ComparingStrings {

    public static void main(String[] args) {
        String word1="java";// create in string pool
        String word2="java";// re - use from String pool
        String word3= new String ("java");  //create in heap , outside String pool


        System.out.println(word1==word2);  //true
        System.out.println("word1.equals(word2) = " + word1.equals(word2));  // true
        System.out.println("word2==word3 = " + word2 == word3); //false
        System.out.println( word2.equals(word3)); //true
    }



}
