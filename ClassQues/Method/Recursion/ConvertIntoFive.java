import java.util.*;

class ConvertIntoFive
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

        // 1050067 -> 1555567  
                // int rev = 0;
        	// while(num != 0){
        	// 	int dgt = num%10;
                //         rev = (dgt == 0) ? (rev = rev*10+5) : (rev = rev*10+dgt);
        	// 	num /= 10;
        	// }

        	// int ans = 0;
        	// while(rev != 0){
        	// 	int dgt = rev%10;
        	// 	ans = ans*10+dgt;
        	// 	rev /= 10;
        	// }

        	// System.out.println(ans);

          
               // int rev = 0;
               // int ans = 0;

               // for(int i = num; i > 0; i /= 10){		
               // 	   int dgt = i%10;
               // 	   rev = (dgt == 0)?(rev = rev*10+5):(rev = rev*10+dgt);
               // }

               // for(int i = rev; i > 0; i /= 10){
               // 	 int dgt = i%10;
               // 	 ans = ans*10+dgt;
               // }

               // System.out.println(ans);



              int ans = 0;
              int cnt = 0;

              for(int i = num; i > 0; i /= 10){
              	cnt++;
              }

              int []arr = new int[cnt];


              for(int i = num, j = 0; i > 0; i /= 10, j++){
              	  arr[j] = i%10;
              }
              
              System.out.print("Push the element inside the array: ");
              for(int i = arr.length-1; i >= 0; i--){
              	System.out.print(arr[i]+" ");
              	  if(arr[i] == 0){
              	  	ans = ans*10+5;
              	  }else{
              	  	ans = ans*10+arr[i];
              	  }
              }

              System.out.println();

              System.out.print("Answer is: "+ans);

	}

}