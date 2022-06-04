package Practice;

public class Frequency {
    public static void main(String[] args) {

        System.out.println("frequencyOfChars(\"MERROONN\") = " + frequencyOfChars("MERROONN"));
    }

    public static String frequencyOfChars(String str){

       String expectedResult="";
       int j=0;

       while(j<str.length()){  // acts as second loop
           int count =0;
           for(int i =0;i<str.length();i++){  // second loop
               if(str.charAt(i)==str.charAt(j)){
                   count++;
               }
           }
           expectedResult+=str.charAt(j)+""+count;
          str=str.replace(""+str.charAt(j),"");
       }

       return expectedResult;


    }
}
