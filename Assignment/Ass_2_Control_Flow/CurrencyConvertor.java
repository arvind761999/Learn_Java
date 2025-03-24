import java.util.Scanner;

class CurrencyConvertor
{
	public static void main(String[] args)
	{
		System.out.print("Enter the value: ");

		Scanner sc = new Scanner(System.in);

		double amnt = sc.nextDouble();

		System.out.print("Enter the Currency to convert from (USD, EUR, INR, JPY):  ");
		String fromCurrency = sc.next().toUpperCase();
        
        System.out.println();

        System.out.print("Enter the currency to Convert to (USD, EUR, INR, JPY): ");
        String toCurrency = sc.next().toUpperCase();

        double conversionRate = 0;

        // Convert From USD To INR
        if(fromCurrency.equals("USD") && toCurrency.equals("INR")){
             conversionRate = 86.0257;   
        }


        //Convert From INR To USD
        if(fromCurrency.equals("INR") && toCurrency.equals("USD")){
        	conversionRate = 1/86.0257;
        }


        // Convert From USD To EUR
        if(fromCurrency.equals("USD") && toCurrency.equals("EUR")){
             conversionRate = 0.9236;   
        }


        //Convert From EUR To USD
        if(fromCurrency.equals("EUR") && toCurrency.equals("USD")){
        	conversionRate = 1/0.9236;
        }


        // Convert From EUR To INR
        if(fromCurrency.equals("EUR") && toCurrency.equals("INR")){
             conversionRate = 93.1400;   
        }


        //Convert From INR To EUR
        if(fromCurrency.equals("INR") && toCurrency.equals("EUR")){
        	conversionRate = 1/93.1400;
        }


        // Convert From INR To JPY
        if(fromCurrency.equals("INR") && toCurrency.equals("JPY")){
             conversionRate = 1/0.5785;   
        }


        //Convert From JPY To INR
        if(fromCurrency.equals("JPY") && toCurrency.equals("INR")){
        	conversionRate = 0.5785;
        }

  
        amnt = amnt*conversionRate;
        System.out.print("Converted value: "+ amnt);



	}
}