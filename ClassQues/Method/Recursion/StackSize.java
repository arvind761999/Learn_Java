import java.util.Scanner;

class StackSize
{
	static int cnt = 0;
	public static void main(String[] args){
	  System.out.println("main() starts");
        m1();
	}
    
	public static void m1(){
		cnt++;
		System.out.println("m1() "+ cnt);
		System.out.print(" Hello ");
		System.out.print(" m1() Hello ");
		m1();

	}
}