import java.util.Scanner;

class RinTimeFrameExecutionFlow
{
	static int a = 1;
	public static void main(String[] args){

	   Scanner sc = new Scanner(System.in);

	   System.out.println("main starts");
	   m1(1);

	   System.out.println("main ends");
	}

	public static void m1(int num){
	   System.out.println("m1 :"+ num);

	   if(num == 3){
	     return;
	   }

	   m1(++num);

	   System.out.println("Hello :"+ a++);
	}
}