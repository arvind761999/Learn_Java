
class CheckEvenOdd3
{
   public static void main(String[] args)
   { 
     
      int num = 5;
      String Op = ((num%2) == 0)
                  ?(num + " is a Even Number")
                  :( num + " is a Odd Number"); 
      System.out.println(Op);
 
   }
}