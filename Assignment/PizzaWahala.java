import java.util.Scanner;
	public class PizzaWahala{
	public static void main(String[] args){
	
	menu();
}
	public static void menu(){
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("enter the number of guest: ");
	int numberOfGuests =  userInput.nextInt();

	System.out.print("""
	Pizza type		Number of Slices		Price per box
	1. Sapa size			4			    2,500 
	2. Small money			6			    2,900
	3. Big boys			8			    4,000
	4. Odogwu			12			    5,200
	""");
	
	System.out.print("enter the pizza type: ");
	int pizzaType = userInput.nextInt();
	
	int slices = 0;
	int price = 0;
	String pizzaName = "";
	switch(pizzaType){
		case 1:	
			slices = 4;
			price = 2500;
			pizzaName = "Sapa size";
			break;
		case 2:	
			slices = 6;
			price = 2900;
			pizzaName = "Small money";
			break;
		case 3:	
			slices = 8;
			price = 4000;
			pizzaName = "Big boys";
			break;
		case 4:	
			slices = 12;
			price = 5200;
			pizzaName = "Odogwu";
			break;	

}
	
	int totalSlices = numberOfGuests;
	int numberOfBoxes = totalSlices / slices;
	if(totalSlices % slices != 0){
		numberOfBoxes += 1;
	System.out.println("Your order is " + numberOfBoxes  + " " + pizzaName + " box(es)");
	}

	int slicesLeft = numberOfBoxes * slices - totalSlices;
	int totalPrice = numberOfBoxes * price;
	
	System.out.println("Number of slices left after serving is " + slicesLeft + " " + "slices");
	System.out.println("Your order is " + numberOfBoxes  + " " + pizzaName + " pizza box(es) for " + totalPrice + ".");

	}
}