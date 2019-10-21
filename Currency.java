
	//Objective: How much is my money worth

import java.util.Scanner;
public class Currency {
	public static void main(String[] args) {
		//declare variables
		double usd, currency;
		String country;
		
		//inputs
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Select a county: \n Britain\n France\n Cina\n Italy\n Japan\n Switzerland\n");
	country = scan.nextLine().toLowerCase();
	System.out.print("Enter the amount of money to exchange: ");
	usd = scan.nextDouble();
	
	switch (country) {
		case "britain":
			currency = usd * 0.81;
			System.out.printf("USD to British Pounds: $%.2f = %.2f Pounds", usd, currency);
				break;
		case "china":
			currency = usd * 6.89;
			System.out.printf("USD to Chinese Yuans: $%.2f = %.2f Yuans", usd, currency);
				break;
		case "france && italy":
			currency = usd * 0.95;
			System.out.printf("USD to Euros: $%.2f = %.2f Euros", usd, currency);
				break;
		case "japan":
			currency = usd * 114.40;
			System.out.printf("USD to Yen: $%.2f = %.2f Yen", usd, currency);
				break;
		case "switzerland":
			currency = usd * 1.01;
			System.out.printf("USD to Francs: $%.2f = %.2f Francs", usd, currency);
				break;
		default: System.out.println("Currency cannot be converted");
	}
	}
	

}
