class Ticket
{
	String name;
	String type;
	String des;
	String contact;

	Ticket(){
		this("Guest");
	}

	Ticket(String name){
		this(name, "General");
	}

	Ticket(String name, String type){
		this(name, type, "Not Specified");
	}

	Ticket(String name, String type, String des){
		this(name,type,des, "Not Specified");
	}

	Ticket(String name, String type, String des, String contact){
		this.name = name;
		this.type = type;
		this.des = des;
		this.contact = contact;

		// this(name, type, des, contact); -> CTE

	}


   public void displayTicket(){
   	System.out.println("Name: "+ name +
            ", SeateType: "+ type + ", Destination: "+des+ ", Contact: "+ contact);
   }

}



class TicketDriver
{
	public static void main(String[] args)
	{
	    System.out.println("main()");

	    Ticket t1 = new Ticket("Arvind", "AC", "Bhopal", "9849389493");
	    t1.displayTicket();
        
        Ticket t2 = new Ticket("Atul", "Sleeper", "Indore");
        t2.displayTicket();

        Ticket t3 = new Ticket("Jayesh", "Gwl");
        t3.displayTicket();

        Ticket t4 = new Ticket("Kratik");
        t4.displayTicket();

        Ticket t5 = new Ticket();
        t5.displayTicket();

	}
}