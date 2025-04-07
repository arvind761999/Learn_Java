import java.util.Scanner;

class ReverseNumber
{
	public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);

	   System.out.print("Enter the number: ");
	   int n = sc.nextInt();

	   int ans = 0;
	   for(int i = n; i > 0; i /= 10){
           
           int dig = i%10;
           ans = ans*10+dig;
	   	  
	   }

	   System.out.print("The reverse number is: "+ans);

	}
}