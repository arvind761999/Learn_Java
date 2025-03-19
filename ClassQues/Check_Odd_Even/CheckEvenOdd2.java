
class CheckEvenOdd2
{
   public static void main(String[] args)
   { 
     
      int num = 4;
      String Op = ((num/2)*2 == num)
                  ?(num + " is a Even Number")
                  :( num + " is a Odd Number"); 
      System.out.println(Op);
 
   }
}