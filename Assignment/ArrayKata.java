import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayKata{
	public static void main(String... args){
		
	int [] input = {30,60,21,41};
	System.out.println("The largest element is: " +maximumIn(input));
	System.out.println("The lowest element is: " +minimumIn(input));
	System.out.println("The Sum is: " +sumOf(input));
	System.out.println("The Sum of even numbers is: " +sumOfEvenNumbers(input));
	System.out.println("The Sum of odd numbers is: " +sumOfOddNumbers(input));
	System.out.println("The Minimum And Maximum: " +Arrays.toString(maximumAndMinimum(input)));
	System.out.println("The Numbers of Odd Numbers is " +numbersOfOddNumbers(input));
	System.out.println("The Numbers of Even Numbers is " +numbersOfEvenNumbers(input));
	System.out.println("The Even Numbers are " +Arrays.toString(evenNumbersInArray(input)));
	System.out.println("The Odd Numbers are " +Arrays.toString(oddNumbersInArray(input)));
	System.out.println("The Odd Numbers are " +Arrays.toString(squareOfNumbersInArray(input)));
}
	
 	public static int maximumIn(int[] numbers) {		
	int maximum = numbers[0];
		for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > maximum){
			maximum = numbers[count];
		}
		}
			return maximum;
	
	}
	
	public static int minimumIn(int[] numbers) {		
	int minimum = numbers[0];
		for(int count = 0; count < numbers.length; count++){
		if(numbers[count] < minimum){
			minimum = numbers[count];
		}
		}
			return minimum;
	
	}

	public static int sumOf(int[] numbers) {		
	int total = 0;
		for(int count = 0; count < numbers.length; count++){
			total += numbers[count];
		}
			return total;
	
	}

	
	public static int sumOfEvenNumbers(int[] numbers) {		
	int total = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0){
			total += numbers[count];
			}
		}
			return total;
	
	}	

	public static int sumOfOddNumbers(int[] numbers) {		
	int total = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 != 0){
			total += numbers[count];
			}
		}
			return total;
	
	}

	public static int[] maximumAndMinimum(int[] numbers) {		
	int [] result = new int [2];
	result[0] = maximumIn(numbers);
	result[1] = minimumIn(numbers);
	return result;
	}	

	public static int numbersOfOddNumbers(int[] numbers) {		
	int total = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 != 0){
			total ++;
			}
		}
			return total;
	
	}

	public static int numbersOfEvenNumbers(int[] numbers) {		
	int total = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0){
			total ++;
			}
		}
			return total;
	
	}

	public static int [] evenNumbersInArray(int[] numbers) {		
	ArrayList<Integer> result = new ArrayList<Integer>();
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0){
			result.add(numbers[count]);
			}
		}
			return toArray(result);
	
	}

	public static int [] oddNumbersInArray(int[] numbers) {		
	ArrayList<Integer> result = new ArrayList<Integer>();
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 != 0){
			result.add(numbers[count]);
			}
		}
			return toArray(result);
	
	}


	public static int [] squareOfNumbersInArray(int[] numbers) {		
	int [] result = new int[numbers.length];
		for(int count = 0; count < numbers.length; count++){
			result[count] = numbers[count] * numbers[count];
		}
			return result;
	
	}


	public static int [] toArray(ArrayList<Integer> numbers) {
		int [] result = new int[numbers.size()];
		for(int count = 0; count < numbers.size(); count++){
			result[count] = numbers.get(count);
		}
		return result;
	
	}


	


				
	
	
	 		
}	

	