package day45_OOP;

public class TrafficLight {
         String color ;

         public void showColor(){
                System.out.println("Current Color = " + color);
            }


   public void changeColor(String newColor){
       System.out.println("newColor = " + newColor);
       color=newColor;

   }
}
