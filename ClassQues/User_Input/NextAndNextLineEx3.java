import java.util.Scanner;

class NextAndNextLineEx3
{
	public static void main(String[] args){

      //Create Scanner Object and assign reference into the Scanner object 

      Scanner sc = new Scanner(System.in);

      //System.out.print("Enter the string1: ");
      String str1 = sc.next();
      System.out.println("str1: " + str1);

      sc.nextLine();
      String str2 = sc.nextLine();
     
	}
}