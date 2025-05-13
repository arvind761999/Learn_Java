class Student
{
	// Non-static variable
	String name;
	int sid;
	double cgpa;


// Non arguments constructor
	Student(){
		System.out.println("No args constructor");
	}


// Parameterize constructor
   Student(String name, int sid, double cgpa){
            this.name = name;
            this.sid = sid;
            this.cgpa = cgpa;
   }

   // non static method
   public void displayStudent(){
   	System.out.println("Name: "+ name);
   	System.out.println("Sid: "+ sid);
   	System.out.println("Cgpa: "+ cgpa);
   }


	public static void main(String[] args)
	{
	   System.out.println("main()");
	  System.out.println();

	   // Object creation

	    Student obj1 = new Student();
	    obj1.displayStudent();
	    System.out.println();

	    Student obj = new Student("Arvind Singh Thakur", 18, 8.22);
	    obj.displayStudent();
	    System.out.println();
      
	    obj.name = "Ram";
	    obj.sid = 19;
	    obj.cgpa = 9.12;

	    obj.displayStudent();

	}
}