import java.util.Scanner;

class PalindromeNumber
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
	    int num = sc.nextInt();
	    int rev = 0;
        
        if(reverseNumbner(num,rev) == num){
        	System.out.print("Palindrome");
        }else{
        	System.out.print("Not palindrome");
        }
	    
	}
//                                   
	public static int reverseNumbner(int num, int rev){
           // Base case
           if(num == 0){
           	return rev;
           }

           int dgt = num%10;
           // recursive call
           int ans = reverseNumbner(num/10, rev*10+dgt);
           return ans;
       
	     
	}
}