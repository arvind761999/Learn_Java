import java.util.Scanner;

class Factors
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num = sc.nextInt();

        System.out.print("Factors  of " + num + " are: ");
	    for(int i = 1; i <= num; i++){
	    	if(num%i == 0){
	    		System.out.print( i + " ");
	    	}
	    }

	}
}