class CheckAlphabetIsUcaseOrLcase
{

 public static void main(String [] args)
 {
 
   char ch = 'd';
   
  String Op = (ch >= 65 && ch <= 90)?
	     (ch + " Alphabet is Uppercase"):
	     (ch + " Alphabet is lowercase");
   System.out.println(Op);
   
 
 }

}