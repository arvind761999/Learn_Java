class NonStaticMembers
{

	static String str = "non-static var";
	static String str1 = "static var";

	static Demo obj3 = new Demo();

	public static void m3(){
		System.out.println("m3() static method obj3");
		obj3.m1();
	}

	static{
             System.out.println("Static- blook obj3"); //1
             obj3.m1();
	}




	public static void main(String[] args){
     System.out.println("main()"); // 2
     NonStaticMembers obj = new NonStaticMembers();
     obj.m2();

     Demo obj2 = new Demo();
     obj2.m1(); 
     obj3.m1();

   
	}

	

	public void m2(){
		// System.out.println("m2() non-static"); // 7
		// System.out.println(str); // 8
		// System.out.println(str1);
		// Demo obj = new Demo();
		// obj.m1();
		obj3.m1();
		m3();
	
	}

}

class Demo{

	public final synchronized void m1(){
		System.out.println("m1() method from Demo");
	}

}