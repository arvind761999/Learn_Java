class Demo8
{

    static int a = 3; // static variable
    int b = 5; // non-static variable

	public static void main(String[] args){
	   System.out.println("main() from Demo8");
	   m2();
	}

	public void m1(){
		System.out.println("m1() non-static method");
	}; // non-static method

	public static void m2(){
		System.out.println("m2()");

		System.out.println("sattic variable: "+a);

		Demo8 obj = new Demo8();

		System.out.println(obj.b);
		
		obj.m1();

	}
}