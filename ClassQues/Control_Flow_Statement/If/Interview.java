import java.util.Scanner;

class Interview
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the %: ");
     int num = sc.nextInt();

     if(num > 60){
        
        System.out.println("Student  is eligible for interview :"+ num);
      }
     else{
        System.out.println("Student  is not eligible for interview :"+ num);
     }
    
   }
}