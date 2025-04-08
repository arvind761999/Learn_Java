import java.util.Scanner;

class CheckPalindrome
{
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number: ");
	   int num = sc.nextInt();

	   int reverseNumber = 0;
	   for(int i = num; i > 0; i /= 10){
	       int dgt = i%10;
	       reverseNumber = reverseNumber*10 + dgt;
	   }

	   System.out.println(num == reverseNumber ? "Palindrome" : "Not Palindrome");

	} 
}