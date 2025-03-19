import java.util.Scanner;

class IncreaseSal
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the Ammount to pay Emp: ");
     int num = sc.nextInt();

     System.out.print("Enter the target ");
     int target = sc.nextInt();

     if(target >= 90){
        num += num*0.03;
        System.out.println("After 3% increases The pay ammount is :"+ num);
      }
     else{
       num += num*0.01;
       System.out.println("After 1% increases The pay ammount is :"+ num);
     }
    
   }
}