// 3.

class Demo
{
	public static void main(String[] args){
	  System.out.println("main()");

	}

	public static void m1(){
	   System.out.println("m1() static from Demo class");
	}
}

class Demo2
{
	public static void main(String[] args){
         System.out.println("main()");
	}

	static{
	  System.out.println("static-block Demo2");
	  Demo.m1();
	}

	public static void m2(){
	  System.out.println("m2() static From Demo2 clss");
	}
}