class AccStaticMethInsideNonStatic
{
	public static void main(String [] args){
	   System.out.println("main()");
	}

	public static void m1(){
	  System.out.println("m1()");
	}
}

class AccStaticMethInsideNonStatic1
{
	AccStaticMethInsideNonStatic1()
	{
	   System.out.println("class2 Constructor"); //4.class2 Constructor
	   AccStaticMethInsideNonStatic.m1();
	}

	{
       System.out.println("class2 non-Static block"); //3.class2 non-Static block
       AccStaticMethInsideNonStatic.m1();
	}

	String str = "Non-static variable";

	public static void main(String[] args){

		System.out.println("main from class2"); //1.main from class2

		AccStaticMethInsideNonStatic.m1(); //2.m1()

		AccStaticMethInsideNonStatic1 obj = new AccStaticMethInsideNonStatic1();

	    obj.m2();

	    System.out.println(obj.str);//7.Non-static variable
	}

	public  void m2(){

		System.out.println("m2()"); // 5.m2()
		// AccStaticMethInsideNonStatic.m1();
			    System.out.println("inside m2()"+str); // 6.Non-static variable
	}
}