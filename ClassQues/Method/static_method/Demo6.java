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

	public static void main(String[] args){
		System.out.println("main() From demo7");
	}

}