import java.util.Scanner;

class ReverseNumberStatic
{
	static int num;
	static int rev;

	public static void main(String[] args){
		
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
     num = sc.nextInt();

     for(int i = num; i > 0; i /= 10){
     	int dgt = i%10;
     	rev = rev*10+dgt;
     }

     System.out.println("Reverse Number: "+ rev);

	}
}