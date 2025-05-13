class Address
{
	String locality;
	String area;
	String city;
	String state;
	int pincode;

	Address(String locality, String area, String city,
            String state, int pincode){
		 super();
		 this.locality = locality;
		 this.area = area;
		 this.city = city;
		 this.state = state;
		 this.pincode = pincode;
	}

	public  void displayAddress(){
              System.out.println("address : "+ locality +"," +area +","
                                  +city+ ","+state+","
                                  +pincode);
	}


}

class Education
	{
		String course;
		String university;
		int yop;
		double per;


		Education(String course, String university, 
			      int yop, double per){
            super();
            this.course = course;
            this.university = university;
            this.yop = yop;
            this.per = per;
		}

		public void  displayEducation(){
			System.out.println("Education Details: ");
			System.out.println("Course : "+ course);
			System.out.println("University/Board: "+ university);
			System.out.println("YOP: "+yop);
			System.out.println("Percentage/CGPA: "+ per);

		}
	}


	class Student
	{
         String name;
         long contact;
         String email;
         Address address;
         Education education;

         Student(String name, long contact, String email,
                  Address address, Education education){
         	super();
         	this.name = name;
         	this.contact = contact;
         	this.email = email;
         	this.address = address;
         	this.education = education;
         }


          Student(Student oldObj){
         	this.name = oldObj.name;
         	this.contact = oldObj.contact;
         	this.email = oldObj.email;
         	this.address = oldObj.address;
         	this.education = oldObj.education;

          }

         public void displayStudent(){
         	System.out.println("Student info:");
         	System.out.println("Name: "+ name);
         	System.out.println("Contact: "+ contact);
         	System.out.println("Enmail: "+email);
         	System.out.println();
         	address.displayAddress();
         	System.out.println();
         	education.displayEducation();



         }



	}


	class StudentDriver
	{
		public static void main(String[] args){
			
			Address address = new Address("JM Road","Deccan", "Pune", "Maharashtra", 411011);
			// address.displayAddress();

         
			Education education = new Education("BE_IOT", "RGPV",2024, 8.22);
			// education.displayEducation();


			Student oldObj = new Student("Arvind Singh Thakur", 918738278, 
				"arvind@234gmail.com", address, education);
            System.out.println();
			System.out.println("OLD OBJ BELOW:");
			System.out.println();
			oldObj.displayStudent();

            System.out.println();
            System.out.println("________________________________");

            System.out.println("Copy of OLD OBJ BELOW:");
            System.out.println();

            Student copy = new Student(oldObj);
            copy.displayStudent();



             System.out.println("________________________________");
             System.out.println("AFTER CHANGES IN COPY: ");
             System.out.println();
             copy.education.course = "B.TECH IN IOT";
             copy.address.locality = "FC ROAD";
             copy.displayStudent();

             System.out.println("________________________________");
             System.out.println("OLD OBJ AFTER CHANGES IN COPY OBJ: ");
             System.out.println();
             oldObj.displayStudent();










		}
	}


