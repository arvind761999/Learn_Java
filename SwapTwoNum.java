class SwapTwoNum
{
	public static void main(String [] args)
	{
		int a = 5;
		int b = 3;
		System.out.println("Before swaping number ");
		System.out.println("a = " + a);
		System.out.println("b =" + b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swaping number become ");
		System.out.println("a = " + a);
		System.out.println("b =" + b);
	}
}