class StaticMembers
{
	static int a = 19;

	// class static InnerClass{
	// 	int b = 'b';
	// 	 System.out.println("b = "+ b);
	// }

	static{
		int a = 'a';
		System.out.println("a = "+ a);
	}

	public static void main(String[] args){
	   System.out.println("Hello "+ a);
	  
	}
}