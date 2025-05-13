class Parent
{
	Parent(int a){
	    super();
	}
}

class Child extends Parent
{
	Child(){
      super(10);
	}
}

class Driver
{
	public static void main(String[] args)
	{
	   System.out.println("main()");
	   Child obj = new Child();
	}
}