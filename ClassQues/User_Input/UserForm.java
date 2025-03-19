import java.util.Scanner;
class UserForm
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the name: ");
     String name = sc.nextLine();

     System.out.print("Education : ");
     String edu = sc.nextLine();

     System.out.print("YOP: ");
     short yop = sc.nextShort();
    
     System.out.print("CGPA: ");
     float cgpa = sc.nextFloat();

     System.out.print("Contact: ");
     long cont = sc.nextLong();

     System.out.println();
     System.out.println("******* Personal Details *******");
     System.out.println();

     System.out.println("Name is: " + name);
     System.out.println("Education is: " + edu);
     System.out.println("Year Of Passout: " + yop);
     System.out.println("CGPA is: " +  cgpa);
     System.out.println("Contact number is: " + cont);


   }
}