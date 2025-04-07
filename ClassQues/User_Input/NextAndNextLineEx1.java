import java.util.Scanner;

class NextAndNextLineEx1
{
	public static void main(String[] args){

      //Create Scanner Object and assign reference into the Scanner object 

         Scanner sc = new Scanner(System.in);
          
         System.out.print("Enter the string: "); 

         // It excludes the space char's
         //String str1 = sc.next();
         //System.out.println("str1: "+ str1);

         //It includes the space the space char's
         String str2 = sc.nextLine();
         System.out.println("str2: "+ str2);


	}
}