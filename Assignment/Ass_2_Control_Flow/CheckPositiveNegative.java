import java.util.Scanner;

class CheckPositiveNegative
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the number: ");
     int num = sc.nextInt();

     if(num > 0){
        System.out.println(num + " Number is Positive");
      }
     else{
        System.out.println(num + " Number is Negative");
   }
}

}