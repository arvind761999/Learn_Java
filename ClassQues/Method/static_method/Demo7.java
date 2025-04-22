// 5.

class Demo6
{
	public static void main(String[] args){
	   System.out.println("main() From Demo6");
	}

	public static void m1(){
	System.out.println("m1() From Demo6");
	}
}

class Demo7
{
	Demo7(){
		System.out.println("Demo7 constructor");
		Demo6.m1();
	}

	{
		System.out.println("non-static block from Demo7");
		Demo6.m1();
	}

	public void m2(){
		System.out.println("non-static method from Demo7");
		Demo6.m1();
	}

	public static void main(String[] args){
		System.out.println("main() From demo7");
		
		Demo7 obj = new Demo7();
		obj.m2();
	}

}