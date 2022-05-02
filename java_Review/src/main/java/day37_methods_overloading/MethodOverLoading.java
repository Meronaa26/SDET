package day37_methods_overloading;

public class MethodOverLoading {


    public static void main(String[] args) {
        sum(78,90);
        sum("Meron","helen");
        sum(78990,988888);
        MethodOverLoading.sum(90,7888);
    }
    public  static void sum(int sr1, int sr2){
      int total=  sr1+sr2;
        System.out.println(total);
    }

    public  static void sum(double sr1, double sr2){
        double total=  sr1+sr2;
    }

    public static void sum(int sr1, int sr2, int sr3){
        int total=  sr1+sr2+ sr3;
    }
    public static void sum(String sr1, String sr2){
        String total=  sr1+sr2;
        System.out.println(total);
    }
}
