class IncrDecr
{
   public static void main( String [] args)
   {
      /*int a = 3; // a -> 3
      int b = a++; // b -> 3 | a = 4
      int c = ++a; // a -> 5 | c -> 5
      System.out.println(a+b+c);*/ // 13
	  
	  
	  int a = 2; // a -> 2
	  int b = a++; // b -> 2 | a -> 3
	  int c = ++b; // b -> 3 | c -> 3
	                    //4(4) 3(4)  4(4)  4
	  System.outprintln(++a +  b++ + ++c + c);  // 15
   }
}