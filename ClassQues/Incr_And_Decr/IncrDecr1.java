class IncrDecr1
{
   public static void main( String [] args)
   {
	  
	  //int a = 2; // a -> 2
	  //int b = a++; // b -> 2 | a -> 3
	  //int c = ++b; // b -> 3 | c -> 3
	                    //4(4) 3(4)  4(4)  4
	  //System.out.println(++a +  b++ + ++c + c);  // 15


          // int a = 3;         //3  3(4)  4   4(5) 
          // System.out.println( a + a++ + a + a++); // 14


         // int a = 2; // a -> 2
         // int b = 3;  // b -> 3
                           //2  3(4)   2(3)  4(5)  3 
         // System.out.println(a + b++ + a++ + b++ + a); // 14



         /* int a = 3; // a -> 3
          int b = a++;  // b -> 3 | a -> 4
                          // 4(5)  3(4)  5   4
          System.out.println(a++ + b++ + a + b);  // 16 */


         // int a = 2; // a -> 2
                         // 3(3)  3(4)  4
         // System.out.println(++a + a++ + a); // 10



        /*int a = 3; // a -> 3
        int b = a++;  // b -> 3 | a -> 4
        int c = ++a;  // a -> 5 | c -> 5
                        // 5 3  5
        System.out.println(a+b+c); // 13*/


       int a = 2; // a -> 2
       int b = a++;  // b -> 2 | a -> 3
       int c = ++b;  // b -> 3 | c -> 3
                      //  4(4)  3(4)   4(4) 4
       System.out.println(++a + b++ + ++c + c); // 15
       
   }
}