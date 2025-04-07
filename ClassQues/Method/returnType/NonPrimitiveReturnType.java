import java.util.Scanner;

class NonPrimitiveReturnType
{
	public static void main(String [] args)
	{
	   // System.out.println(m1());
	   System.out.println(m2());
       
		
	}


   public static int[] m1(){
   	 return new int[10];
   }

  public static ArrayList<Integer> m2(){
  	return new ArrayList<Integer> ;
  }
	



}