import java.util.Scanner;

class ReverseNumber1
{
	public static void main(String [] args){

	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
       
       int reversNumber = 0;
	   while(num != 0){
          int dgt = num%10;
          reversNumber = reversNumber*10+dgt;
          num /= 10;
	   }

	   System.out.println("reverse number is: "+ reversNumber);
	}
}