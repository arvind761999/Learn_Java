import java.util.Scanner;

class GenerateOtp
{
	public static void main(String [] args)
	{
	   String otp = generateOtp();
	   if(otp.charAt(0) != 0)
	   System.out.println(otp);
	   }

	public static String generateOtp(){
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int n = sc.nextInt();

        String otp = "";
	    for(int i = 1; i <= n; i++){	
          int dgt = (int)(Math.random()*10);
           otp += dgt;
           
	}

	   return otp;
  }
}