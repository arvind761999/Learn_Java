import java.util.Scanner;

class Bank 
{
	private static String name = "State Bank Of India";
	private static long contact = 8498934348l;
	private static String ifsc = "SBIN00000324";
    Account account; // null

	public void displayBank(){
		System.out.println("Bank Details: ");
		System.out.print("Name: "+ name);
		System.out.println("Contact Number: "+ contact);
		System.out.println("IFSC code: "+ ifsc);
	}

	public void createAccount(){
		account = new Account("Arvind","saving", "pune",
	                          123, 10000, 9458498594l);
	}
 
}

class Account extends Bank
{
    private String name;
    private String type;
    private String address;
    private int pin;
    private double balance;
    private long contact;


    Account(String name, String type, String address, int pin, 
            double balance, long contact){
    	super();
    	this.name = name;
    	this.type = type;
    	this.address = address;
    	this.pin = pin;
    	this.balance = balance;
    	this.contact = contact;

    	System.out.println("Account Created SuccessFully");
    }

    public double getBal(){
    	return balance;
    }

    public int getPin(){
    	return pin;
    }
}


class BankDriver
{
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.createAccount();

        System.out.print("Enter the pin: ");
		int pin = new Scanner(System.in).nextInt();

		if(pin == bank.account.getPin()){
			System.out.println("balance: "+ bank.account.getBal());
		}else{
			System.out.println("INVALID PIN");
		}

		// System.out.println("bank name: "+ bank.getName());

	}
}