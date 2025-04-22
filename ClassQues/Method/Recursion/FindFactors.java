import java.util.Scanner;

class FindFactors
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
	    int num = sc.nextInt();

	    // findFactor(num, 1);
	    findFactor(num, num);
	}

	public static void findFactor(int num, int i){

// Logic: 1
		// Base case
		// if(num == i-1){
		// 	return;
		//  }

        //  if(num%i == 0){
	    //  System.out.print(i + " ");
	    //  }


		// // recursive call

	    //  findFactor(num, ++i);

// Logic: 2
		 //  Base Case
		// if(i > num){
		// 	return ;
		// }

		// if(num%i == 0){
		// 	System.out.print(i+ " ");
		// }


		// // recursive call
		// findFactor(num, ++i);


//Logic: 3 it will print the factors in reverse order
       
        //Base Case
        // if(i == 0){
        //    return;
        // } 

        // if(num%i == 0){
        // 	System.out.print(i+" ");
        // }

        // // recursive call
        // findFactor(num, --i);
	}
}