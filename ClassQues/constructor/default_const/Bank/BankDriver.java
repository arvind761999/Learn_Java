
class Bank
{
	// data members/
	static String name = "State Bank Of India";
	String ifsc = "SBIN000123";
	String add = "Deccan Pune";

// Default constructor provide by compiler
// 	 Bank(){
// 	  super();
// }

	public void displayBank(){
		System.out.println("Name: "+name);
        System.out.println("IFSC: "+ ifsc);
        System.out.println("Address: "+ add);
	}
}

class Account extends Bank
{
	// Data members/non-static args
	String accName;
	long contact;


// Default constructor provide by compiler
	//  Account(){
	// 	super();
	// }

	public void displayAccount(){
		System.out.println("Account Details: ");
		System.out.println("Account Holder Name: "+ accName);
		System.out.println("Contact: "+ contact);
	}


}




class BankDriver
{
	public static void main(String[] args)
	{
	   System.out.println("main()");

	   Account acc1 = new Account();
	   acc1.accName = "Arvind Singh Thakur";
	   acc1.contact = 9839293298l;

	   acc1.displayBank();
	   acc1.displayAccount();
	}
}