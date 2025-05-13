class Demo
{
	static int a;
	public static void m1(){
		System.out.println("m1() from Demo class");
		
	}

	public static void m2(){
			System.out.println("m2() from Demo Class");
		}

}


class Example extends Demo
{
     static String b;

     public static void m3(){
     	System.out.println("m3() from Example class");
     }

     public static void m4(){
     	System.out.println("m4() from Example class");
     }

     public static void m2(){
     	System.out.println("m2() from Example class");
     }

     public static void main(String[] args){
     	System.out.println("main() from Example class");
     	m3();
     	m4();
     	m2();
     	Demo.m1();
     	Demo.m2();
     }


}