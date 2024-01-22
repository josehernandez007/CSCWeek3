import java.util.Scanner;

public class TaxWithholdingCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weekly income: $");
		double income = input.nextDouble();
		double taxRate;
		double taxWithholding;
		
		if (income < 500 ) {
			taxRate = 0.10;
		} else if (income >=500 &&income < 1500) {
			taxRate = 0.15;
		} else if (income >=1500 && income < 2500) {
			taxRate = 0.20;
		} else {
			taxRate = 0.30;
			
		}
		taxWithholding = income * taxRate;
		
		System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithholding);
		
		input.close();
	}

}




