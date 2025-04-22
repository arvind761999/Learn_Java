class NonStaticAccessDirectlySameClass
{

     NonStaticAccessDirectlySameClass(){
       System.out.println("Demo class non-static constructor");
       m2();
     }


     {
     	System.out.println("non-static block");
     	m2();
     }

	public static void main(String[] args){
	  System.out.println("main()");
	  m2();
	}  

	public  void m1(){
      System.out.println("m1() non-static");

	}

	public static void m2(){
	System.out.println("m2() static");
	}
}