class CheckDigit
{

public static void main(String [] args)
{

char ch = '1';
String Op = (ch >= 48 && ch <= 57)
	        ?(ch + " is a Digit")
	        :(ch + " is not a Digit");
System.out.println(Op);

}
}