class StaticExample
{
	static{
	  System.out.println("static block 1");
	}

	public static void main(String[] args){
	   System.out.println("main()");
	   System.out.println(StaticExample2.str);
	   System.out.println(StaticExample2.str);

	}
}

class StaticExample2
{
	static String str = "var from StaticExample2 class";

	static{
		System.out.println("static block2");
	}
}

