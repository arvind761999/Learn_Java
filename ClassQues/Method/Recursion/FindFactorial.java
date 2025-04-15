import java.util.Scanner;

class FindFactorial
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
	    int num = sc.nextInt();

	    System.out.print("Factorial is :"+factorial(num));
	}
//                                   4
	public static int factorial(int num){

         // Base case
         if(num == 0){
	      return 1;
	     }
//                               
		int ans = (num*factorial(num-1));
		return ans;
       
	     
	}
}