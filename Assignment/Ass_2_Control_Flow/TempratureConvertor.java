import java.util.Scanner;

class TempratureConvertor
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the convertion: ");

     String str = sc.next();

     
     //1. Celsious to Fahrenhit
     
     if(str.equals("cel_to_far")){
       System.out.print("Enter Temprature in Celcious: ");  
 
       float cel = sc.nextFloat();
       double far = (cel*9/5.0) + 32; // using formula fahrenheit = (Celcious*9/5) +32
     
       System.out.println( "Temprature in Fahrenhit: " + far);
     }

     //2.  Fahrenhit to Celsious

     if(str.equals("far_to_cel")){

         System.out.print("Enter Temprature in Fahrenhit: ");
         float far = sc.nextFloat();

         double cel = (far-32)*5/9.0; // using formula cel = (fahrenheit-32)*5/9.0

         System.out.println("Temprature in Celsious: "+ cel);
     }

     //3.  Kalvin to Celsious

     if(str.equals("kal_to_cel")){

         System.out.print("Enter Temprature in Kalvin: ");
         float kal = sc.nextFloat();

         double cel = kal - 273.15;  // using formula celsious = kalvin - 273.15

         System.out.println("Temprature in Celsious: "+ cel);
     }


     //3.  Celsious  to Kalvin

     if(str.equals("cel_to_kal")){

         System.out.print("Enter Temprature in Celsious : ");
         float cel = sc.nextFloat();

         double kal = cel + 273.15; // using formula kalvin = celsious + 273.15

         System.out.println("Temprature in Kalvin: "+ kal);
     }


   }
}