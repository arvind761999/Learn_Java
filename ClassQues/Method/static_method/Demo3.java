// 4.

class Demo3
{
	public static void main(String[] args){

	  System.out.println("main() From Demo3");
	  Demo4.m2();
	  Demo3.m1();
	  Demo5.m3();

	  Demo5 obj = new Demo5();
	  obj.m4();

	}

	public static void m1(){
		System.out.println("m1() from Demo3 class");
	}
}

class Demo4{
	
	public static void m2(){
		System.out.println("m2() from Demo4");
	}
}