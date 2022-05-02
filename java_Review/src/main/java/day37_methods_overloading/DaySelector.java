package day37_methods_overloading;

public class DaySelector {

    public static void main(String[] args) {

        getDayName(5);

        System.out.println("dayName(2) = " + dayName(2));


        //loop from 1 to 8 and call the getDayName with loop variable
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " = " +getDayName(i)) ;
        }


       // store getName into variable, and print variable
        String today= getDayName(6);
        System.out.println("today = " + today);


        System.out.println("getDayName2(5) = " + getDayName2(4));
    }



    public static String getDayName(int day){

      switch(day){
          case 1 :
             System.out.println("Monday");
            break;
          case 2 :
              System.out.println("Tuesday");
             break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4 :
              System.out.println("Thursday");
              break;
          case 5 :
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
      }


        return "";
    }

    public static String dayName(int day){

        switch (day){
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3: return "Wensday";
            default:
                System.out.println("Invalid day - " + day);
                return null ;
        }

    }

    public static String getDayName2(int day){
  String dayName;

  switch (day){
      case 1:
          dayName ="Monday";
          break;
      case 2:
          dayName="tuesday";
          break;
      case 3:
          dayName ="wensday";
          break;
      case 4:
          dayName ="thursday";
          break;
      case 5:
          dayName="friday";
          break;
      case 6:
          dayName="saturday";
          break;
      case 7:
          dayName="sunday";
          break;
      default:
          System.out.println("Invalid day -" +  +day);
          dayName=null;
  }

        return dayName;
    }
}
