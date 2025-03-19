class IncrDecr1
{
   public static void main( String [] args)
   {
	  
	  int a = 2; // a -> 2
	  int b = a++; // b -> 2 | a -> 3
	  int c = ++b; // b -> 3 | c -> 3
	                    //4(4) 3(4)  4(4)  4
	  System.out.println(++a +  b++ + ++c + c);  // 15
   }
}