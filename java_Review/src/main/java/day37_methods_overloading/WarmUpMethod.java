package day37_methods_overloading;

public class WarmUpMethod {

    public static void main(String[] args) {


//
        loginVoid("meron181295","abcdefg99999");//negative test
        loginVoid("meron181295","abcdefg");// positive test

        System.out.println("login(\"secretUser\",\"1234567\") = " + login("secretUser", "1234567"));


        System.out.println("sum(89,78) = " + sum(89, 78));
    }




    public static void loginVoid(String userName, String passWord){

        String secretUserName="meron181295";
        String secretPassword ="abcdefg";

        if(userName.equals(secretUserName) && passWord.equals(secretPassword)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Incorrect Password or User name ");
        }
    }



    public static Boolean login(String userName, String passWord){

        String user="secretUser";
        String pass="1234567";

        if(userName.equals(user) && passWord.equals(pass)){
            return true;
        }//else{

            return false;
        //}

    }


    public static int sum(int n1, int n2){
        return n1+n2;
    }
}
