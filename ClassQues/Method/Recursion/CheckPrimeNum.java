import java.util.Scanner;

class CheckPrimeNum
{
	public static void main(String [] args)
	{
	   System.out.print("Enter the number: ");
	   int  num = new Scanner(System.in).nextInt();
	   if(isPrime(num,2)){
	   	 System.out.println(num+" Prime");
	   }else{
	   	 System.out.println(num+" Not Prime");
	   }
       
		
	}

//                                   11       2, 3, 4, 5, 6, 7... 11
   public static boolean isPrime(int num, int i){

   	  if(num == i) return true; // 11 == 2 x, 11 == 3 X, 11 == 4 x, 11 == 5 x, 11 == 6 x, 11 == 7 x,... 11 == 11
   	  if(num < 2) return false;  // 11 < 2 x,  11 < 3 x,  11 < 4 x, 11 < 5 x, 11 < 6 x, 11 < 7 x,
   	  if(num%i == 0) return false;  // 11%2 == 0 x, 11%3 == 0 x, 11%4 == 0 x, 11%5 == 0 x,11%6 == 0 x, 11%7 == 0 x,

   	  return isPrime(num, ++i); // 1st -> 11, 3,  2nd -> 11, 4, 3rd -> 11, 5,  4th -> 11, 6,  5th -> 11, 7, 6th -> 11, 8.... 11, 11
   	  
   }
  

}