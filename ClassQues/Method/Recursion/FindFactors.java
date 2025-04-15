import java.util.Scanner;

class FindFactors
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
	    int num = sc.nextInt();

	    findFactor(num, 1);
	}

	public static void findFactor(int num, int i){

         if(num%i == 0){
	     System.out.println(i + " ");
	     }

		// Base case
		if(num == i){
			return;
		}

	     findFactor(num, ++i);
	}
}