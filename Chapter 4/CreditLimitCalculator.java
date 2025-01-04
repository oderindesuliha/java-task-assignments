import java.util.Scanner;
public class CreditLimitCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of customers: ");
       		int numberOfCustomers = input.nextInt();
		
	int newBalance = 0;	


	for (int count = 1; count <= numberOfCustomers; count++) {
		System.out.println("Customer " +count);
		String name = input.nextLine();
	
	System.out.print("Account number: ");
	int accountNumber = input.nextInt();
	
	System.out.print("Balance at the beginning: ");
	int beginningBalance = input.nextInt();

	System.out.print("Total charges on items: ");
	int charges = input.nextInt();

	System.out.print("Total credits applied: ");
	int creditApplied = input.nextInt();
	
	System.out.print("Credit limit: ");
	int creditLimit = input.nextInt();

	newBalance = beginningBalance + charges - creditApplied; 
	System.out.println("Your new balance is: " + newBalance);
	
	if (newBalance > creditLimit){
	System.out.println("Credit limit exceeded");
	}
	}
	}

}