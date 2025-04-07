// Print the series -> a, c, f, j, o, u

import java.util.Scanner;

class PrintSeries
{
	public static void main(String [] args)
	{
	   
                
	   // int i = 0;
	   // for(char ch = 'a'; ch <= 'z'; ch++){

	   // 	  int n = ch+i;
	   // 	  ch = (char)n;

	   // 	  System.out.print(ch + " ");
	   // 	  i++;

	   // }

	   int jump = 1;
	   for(char ch = 'a'; ch <= 'z'; ch += jump){

	   	  System.out.print(ch + " ");
	   	   ++jump;
	   }


	}
}