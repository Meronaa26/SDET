package Practice;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverse(\"MERON\") = " + reverse("MERON"));
        System.out.println("reverse1(\"MERON\") = " + reverse1("MERON"));
    }

    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>0;i--){
            reverse += str.toCharArray()[i];

        }
        return reverse;
    }

    public static String reverse1(String str1){
        return new StringBuilder(str1).reverse().toString();
    }
}
