import java.util.Scanner;

class CheckEvenOdd
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int num = sc.nextInt();
     if(num % 2 == 0){
        System.out.println(num + " is Even");
      }
     if(num % 2 != 0){
       System.out.println(num + " is Odd");
     }
    
   }
}