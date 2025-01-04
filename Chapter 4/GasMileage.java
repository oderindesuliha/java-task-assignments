import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float combinedAverage = 0;
		System.out.print("Enter number of trips: ");
		int number = input.nextInt();
	
	int sentinel = 0;
	int count = 0;
	do{
	for(int counter = 1; counter <= number; counter++){
	
	System.out.print("Enter milesDriven for trip " + counter + ": ");
	float milesDriven = input.nextFloat();
	
	System.out.print("Enter gallons for trip " + counter + ": ");
	float gallonsUsed = input.nextFloat();

	
	float average = (float) milesDriven/gallonsUsed;
	combinedAverage += average;
	System.out.println("Average for trip " + counter + ": " + average);
	}
	System.out.println(" ");
	System.out.print("Do you wish to continue?");
	System.out.print("Type 0 to continue and -1 to stop: ");
	sentinel = input.nextInt();
	}
	while (sentinel != -1);
		
	float overallAverage = combinedAverage / number ;
            System.out.println("Total average for all trips: " + overallAverage);
  
	
	
	}	
}