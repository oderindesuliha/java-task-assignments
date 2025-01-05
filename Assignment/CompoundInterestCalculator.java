import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment (₦): ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter monthly contribution (₦): ");
        double monthlyContribution = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter interest rate variance: ");
        double variance = scanner.nextDouble();

        System.out.println("Choose compound frequency: ");
        System.out.println("1. Daily\n2. Monthly\n3. Annually");
        int choice = scanner.nextInt();

        int compoundFrequency = switch (choice) {
            case 1:
		 365;
            case 2: 
		 12;
            case 3:
		 1;
            default:  
		12;
        };

        compoundInterest(initialInvestment, monthlyContribution, years, interestRate, variance, compoundFrequency);
        
    }

    public static void compoundInterest(double principal, double monthly, int years, double rate, double variance, int freq) {
        for (double r : new double[]{rate - variance, rate, rate + variance}) {
            double total = principal;
            double monthlyRate = r / (frequency * 100);
            int months = years * 12;

            for (int count = 0; count < months; count++) 
                total = (total + monthly) * (1 + monthlyRate);

            System.out.printf("At %.2f%% with %d times compounding: ₦%.2f%n", r, freq, total);
        }
    }
}


}



}