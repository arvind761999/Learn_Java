class AccStaticMethInsideNonStatic
{
	public static void main(String [] args){
	   System.out.println("main()");
	}

	public static void m1(){
	  System.out.println("m1()");
	}
}

class Demo2
{
	Demo2(){
	System.out.println("Demo2 Constructor");
	Demo.m1();
	}
}