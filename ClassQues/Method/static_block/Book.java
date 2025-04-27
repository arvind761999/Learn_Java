class Book 
{
    String name;
	double price;
	String type;
	String publication;
	int size;
	String color;
	String bind;


	Book()
	{

	}

	public static void displayBook(){
		System.out.println("Book name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Type: "+ type);
		System.out.println("Publication: "+ publication);
		System.out.println("size: "+ size);
		System.out.println("color: "+ color);
		System.out.println("bind : "+ bind);
		
	}
}