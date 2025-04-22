import java.util.Scanner;

class ReturnType1
{
	public static void main(String [] args)
	{
	  // m1();
      // System.out.println(m2());
      // m3();	
      // System.out.println(m4());	
      // System.out.println(m5());	
	  // m6();
	  // m7();
	  System.out.println(m8());	
	  // System.out.println(m9());
	  // System.out.println(m10());
	  // System.out.println(m11());
	  // System.out.println(m12());
	  // System.out.println(m13());

	}

	public static void m1(){
		return ;  // Y
	}


	public static int m2(){
		return 10;    // Y
	}

    // public static int m3(){
    // 	return 2147483648; // CTE -> integer number too large
    // }

    public static byte m4() {
    	return 1; // Y
    }

    public static byte m5(){
    	return 1+1; // 
    }

    // public static byte m6(){
    // 	byte a = 1;
    // 	return a+1; // CTE -> possible lossy conversion from int to byte
    // }

    // public static float m7(){
    // 	return 1.0; // CTE -> possible lossy conversion from double to float
    // }

    public static char m8(){
    	return 97; // Y
    }

    // public static char m9(){
    // 	byte a = 97; // CTE -> possible lossy conversion from byte to char
    // 	return a;
    // }

    public static char m10(){
    	return '9'; // Y
    }

   public static long m11(){
   	 return 123l; // Y
   }

   // public static long m12(){
   // 	return "h"; // CTE -> String cannot be converted to long
   // }

    public static char m13(){
   	return "h".charAt(0); // Y
   }

   




}