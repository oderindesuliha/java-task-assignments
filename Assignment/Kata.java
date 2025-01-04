import java.util.Scanner;

	public class Kata{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
	 	int number = input.nextInt();
	isPalindrome(number);
	System.out.println(number + " is " + isPalindrome(number));
	}
 	public static boolean isEven(int number) {	
		if(number % 2 == 0){		
		return true;
	} 
	
		return false;

}
	public static boolean isPrimeNumber(int number) {
	int counter = 0;	
		for(int count = 1; count <= number; count ++){
		if(number % count == 0){
		counter ++;
}	
		
	}
		if(counter == 2){
		return true;
	}
		return false;
    }
	public static int subtract(int firstNumber, int secondNumber){
		if(secondNumber > firstNumber){
		return secondNumber - firstNumber ;
}

		return firstNumber - secondNumber;	

	}	
	public static float divide(float firstNumber, float secondNumber){
		if(secondNumber == 0){
			return 0;
  }

		return firstNumber / secondNumber;	

	}	
	public static int factorOf(int number) { 
        int count = 0;
        	for (int counter = 1; counter <= number; counter++) {
           	if (number % counter == 0) {
                count++;
            }
  }
        	return count;
    }
	public static boolean isSquare(int number) {
        
		for (int count = 1; count < number; count++) {	
		if(number % count == count) {
		return true;
	}
		
}
		return false;
   	}
	public static boolean isPalindrome(int number) {
	
	int lastDigit = number / 10000;
	int fourthDigit = number / 1000 % 10;                
        int secondDigit = number / 10 % 10;  
        int firstDigit = number % 10;  

        if (firstDigit == lastDigit && secondDigit == fourthDigit) {
		return true;
	} 
		return false; 	       
 }
	
	public static long factorialOf(int number) {
        long count = 1;
        for (int counter = 2; counter <= number; counter++) {
            count *= counter;
        }
       		return count;
    }
	public static long squareOf(int number){
		return number * number;

}	 		
	}

	