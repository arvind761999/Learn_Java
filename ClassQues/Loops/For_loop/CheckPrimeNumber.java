import java.util.Scanner;

class CheckPrimeNumber
{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number: ");
	  int num = sc.nextInt();

	  if(num < 1){
	     System.out.println("Not a Prime");
	  }

	  int cnt = 0;
     
	  for(int i = 2; i < num; i++){
	    if(num%i == 0){
	       cnt++;
	    }
	}
	  
	  System.out.println(cnt == 0 ? "Prime" : "Not Prime");
	}
}