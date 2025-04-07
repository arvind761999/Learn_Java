import java.util.Scanner;

class StonePaperScisser
{
	public static void main(String[] args)
	{
		startGame();
	}

	public static void startGame(){

        System.out.println();
		System.out.println("     Your Welcome!");
		System.out.println();
		String userResponse = userResponse();
		String botResponse = botResponse();
		System.out.println( "BOT : "+botResponse +" USER : "+ userResponse);
		System.out.println();
		findWinner(userResponse, botResponse);
	}

	public static String userResponse(){

		Scanner sc = new Scanner(System.in);

		System.out.println("1. STONE");
		System.out.println("2. PAPER");
		System.out.println("3. SCISSER");
		System.out.println();

		System.out.print("User enter your option: ");
		int opt = sc.nextInt();

		System.out.println();
		String userResponse = generateResponse(opt);

		return userResponse;

	}

	public static String botResponse(){
		int opt = 0;
         for(;;){
         	opt = (int)(Math.random()*10);
         	if(opt>0 && opt < 4){
         		break;
         	}
         }

         String botResponse = generateResponse(opt);
         return botResponse;
	}

	public static String generateResponse(int opt){

      String response = "";
      switch(opt){
       
       case 1 : response = "STONE"; break;
       case 2 : response = "PAPER"; break;
       case 3 : response = "SCISSER"; break;
       default : System.out.println("INVALID OPTION"); break;	

      }

      return response;
	}

	public static void findWinner(String userResponse, String botResponse){

		                 // <------------- USER WON ----------->
        
        if(userResponse == "PAPER" && botResponse == "STONE" 
        	|| userResponse == "SCISSER" && botResponse == "PAPER" 
        	|| userResponse == "STONE" && botResponse == "SCISSER"){
        	System.out.println(" **** USER WON **** ");
        }

         // <------------- BOT WON ----------->

        else if(userResponse == "SCISSER" && botResponse == "STONE" 
        	|| userResponse == "STONE" && botResponse == "PAPER" 
        	|| userResponse == "PAPER" && botResponse == "SCISSER"){
            System.out.println(" **** BOT WON **** ");
        }
        else{

            System.out.println(" **** DRAW **** ");
 
        }

	}

}