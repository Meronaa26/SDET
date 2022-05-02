package day38_methods;

public class StringUtils {

    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"Meron\") = " + isNullOrEmpty("Meron"));
        System.out.println(isNullOrEmpty(""));
        String word=null;
        System.out.println(word.isEmpty());
    }
    public static boolean isNullOrEmpty( String str){

        //return (str==null || str.isEmpty())
        if(str==null || str.isEmpty()){
            return  true;
        }

       return false;

    }

    public static boolean isPalindrome(String str){
         str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {    //it will stop when it is at the middle
           if(str.charAt(i)!=str.charAt(str.length()-1-i)){
               return false;
           }
        }

        return true;
    }

    public static boolean palindrome2(String str){  //I like this way more

        int i=1;
        int j=str.length()-1;
           while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static String reverse(String str){

        String reverse="";
        for (int i = str.length()-1;i>=0; i--) {
            reverse+=str.charAt(i);

        }

        return reverse;
    }
}
