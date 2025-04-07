import java.util.Scanner;

class ReturnType
{
	public static void main(String [] args)
	{
	   // m1();
       // m2();
	   // m3();
		m4();
	}


	public static void m1(){
		System.out.println("m1() start");
		int sum = 0;

		for(int i = 1; i <= 10; i++){
		   int rendomDgt = (int)(Math.random()*9); 
		   System.out.println("dgt: "+ rendomDgt); 
           sum += rendomDgt;
           System.out.println(i + " : " + sum);
           if(sum > 40)
		    return ;
		}

		System.out.println(sum);

        System.out.println("m1() ends");
        

	}


	public static  void m2(){
		System.out.println("m2() starts");
		return ;
	}


	public static void m3(){
		System.out.println("Hello1");
		System.out.println("Hello2");
        if(true)
        	return ;
        System.out.println("Hello3");
        System.out.println("Hello4");
	}

	public static void m4(){
		System.out.println("Hello1");
		if(!true){
			System.out.println("continue exe.... ");
		}
		else{
			System.out.println("exe terminate");
			return ;
		}

		System.out.println("Hello2");
	}



}