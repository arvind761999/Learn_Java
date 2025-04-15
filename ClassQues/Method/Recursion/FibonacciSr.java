import java.util.Scanner;
class FibonacciSr
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int n = sc.nextInt();
	    int a = 0;
	    int b = 1;
   

        // System.out.print(a+" "+ b + " ");
	    // FibonacciSeries1(a,b,n);
	    for(int i = 0; i <= n; i++){
	    System.out.print(FibonacciSeries2(i)+ " ");
	    }
	    

	}

//                                                       7
	// public static void FibonacciSeries1(int a, int b, int n){

	//        // Base case
	//        if(n == 0){
    //           return;
	//        }

    //        int c = a+b;
    //        System.out.print(c+" ");

    //        //recursive call      7
           
    //        FibonacciSeries(b, c, --n);
	// }

	public static int FibonacciSeries2(int n){
		// Base Case
		if(n == 0 || n == 1){
			return n;
		}

		// recursive call
		return FibonacciSeries2(n-2)+FibonacciSeries2(n-1);
	}
}