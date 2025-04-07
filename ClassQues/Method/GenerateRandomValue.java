import java.util.Scanner;

class GenerateRandomValue
{
	public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number: ");
	   int n = sc.nextInt();

	   for(; ;){

	   	  System.out.print((int)(Math.random()*10)+"  ");
	   }

	}
}