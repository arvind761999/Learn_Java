class Teacher
{
	static{
	  System.out.println("static block 1");
	}

	public static void main(String[] args){
	   System.out.println("main()");
	   Student obj1 = new Student();
	   Student obj2 = new Student();

	}
}

class Student
{
	
	static{
		System.out.println("static block2");
	}
}

