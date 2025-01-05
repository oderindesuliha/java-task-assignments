import java.util.Scanner;
	public class SnackFunction{

	public static void main(String [] args){
		System.out.print("enter successful delivery: ");
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
	
	
	System.out.print("The rider's pay is: " + logisticsServices(input));
	}

	public static int logisticsServices(int input){
		
		int ridersPayment = 0;	
		if(input < 50){
		   ridersPayment = input * 160 + 5000;
		}if(input >= 50 && input <= 59){
		   ridersPayment = input * 200 + 5000;	
		}if (input >= 60 && input <= 69){
		   ridersPayment = input * 250 + 5000;		
		}if (input >= 70){
		   ridersPayment = input * 500 + 5000;
		}
		return ridersPayment;
	}

}