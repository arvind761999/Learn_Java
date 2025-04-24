class Bike
{
   String brand;
   String model;
   String type;
   double fuelCap;
   double cc;
   double mil;
   double price;
   int cap;
   String reg;

   public void displayBike(){

   	 System.out.println("Bike Details ");
   	 System.out.println("Brand: "+ brand);
   	 System.out.println("Model: "+ model);
   	 System.out.println("Type: "+ type);
   	 System.out.println("Fuel Capacity: "+ fuelCap+ " liters");
   	 System.out.println("Engine Capacity: "+ cc + " cc");
   	 System.out.println("Price: "+ price+ " rs");
   	 System.out.println("Cap: "+ cap);
   	 System.out.println("Registration: "+ reg);

   }

   public void travelling(){
   	System.out.println("Bike can be use for travelling");
   }

}


class ObjectExample
{
	public static void main(String[] args){
      
       Bike obj1 = new Bike();
       System.out.println();
       System.out.println("Before initializing the value: ");
       System.out.println();

       obj1.displayBike();

       System.out.println("________________ || ___________________");
       System.out.println();


       System.out.println("After initializing the value: ");
    
       obj1.brand = "Yamaha";
       obj1.model = "RX_100";
       obj1.type = "Racing bike";
       obj1.fuelCap = 12;
       obj1.cc = 100;
       obj1.mil = 35;
       obj1.price = 100000;
       obj1.cap = 2;
       obj1.reg = "MP-04-AA-3745";
       obj1.displayBike();


	}
}