class Example
{


    static String str2 = "static var";

    static{
    	System.out.println("Static block");
    }


    public static void m3(){

    	System.out.println("m3() static method");
    }



	String str = "non- static var";

	{
		System.out.println("non-sattic block");
	}

	public final synchronized void m1(){
		System.out.println("m1() non static method");
		System.out.println(str);
		System.out.println(str2);
	}




	public static void main(String[] args){
	    System.out.println("main()");

	    Example obj = new Example();
	    obj.m1();
	    obj.m2();
	    m3();

	}



	public void m2(){
		System.out.println("m2() non static method");
		m1();
		m3();

		Example1 obj = new Example1();
		obj.m5();
	}


}

class Example1
{
	public void m5(){
		System.out.println("m5() non-sattic method from Example1");
	}
}