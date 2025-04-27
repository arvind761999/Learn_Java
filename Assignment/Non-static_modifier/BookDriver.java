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

	public  void displayBook(){
		System.out.println("Book name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Type: "+ type);
		System.out.println("Publication: "+ publication);
		System.out.println("size: "+ size);
		System.out.println("color: "+ color);
		System.out.println("bind : "+ bind);
		
	}
}



class BookDriver
{
	public static void main(String[] args)
	{
	     Book obj = new Book();
	     obj.displayBook();
	     System.out.println("!____________________________________________!");
	     System.out.println();
	     obj.name = "Java Programming";
	     obj.price = 349.0;
	     obj.type = "reading";
	     obj.publication = "Mr.jones";
	     obj.size = 980;
	     obj.color = "blue";
	     obj.bind = "Spiral";
	     obj.displayBook();

	}
}