package day39_Wrappers;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=100;
        System.out.println("num = " + num);

        Integer n= new Integer(78);
        System.out.println( n.equals(78));
        System.out.println("n+300 = " + n + 300);
        System.out.println("n.equals(500) = " + n.equals(500));

        Integer intObject= 600;
        System.out.println("intObject = " + intObject);


        String str="hello";
        String strNum=intObject+"";
        String numst=n.toString();

        System.out.println("numst = " + numst);
        System.out.println("strNum = " + strNum);


        Byte b1=10;
        Byte b2=new Byte((byte) 5);

        Short sh1=new Short((short) 90);
        Short sh2=10;


        Integer in1=10;
        Integer int2= new Integer(567);

        Long l1=34566L;
        Long l2= new Long(568999);

        Float fl=6778888.90F;
        Float f2= new Float(45678.98);

        Double d1=87900D;
        Double d2=new Double(86655444);











    }
}
