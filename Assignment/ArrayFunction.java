import java.util.Arrays;
import java.util.Scanner;
public class ArrayFunction{
	public static void main(String[] args){
	
	int[] number = {12, 13, 30, 2, 5};
	int largest = largestElement(number);
	System.out.println("The largest element is: " + largest);

	int[] numbers = {12, 3, 6, 7, 9};
	int[] reversed = reversedElements(numbers);
	System.out.println("Reversed elements: " + Arrays.toString(reversed));
	
	int[] elements = {10, 5, 30, 2, 9};
	int element = 10;
	String existingElement = elementOccurrence(elements , element);  
	System.out.println(existingElement); 

	int[] odd = new int[] {5, 10, 15, 20, 25, 30, 45, 15, 35, 50};
	int[] oddPlacements = oddPositions(odd);
	System.out.println("The elements in odd positions are: " +  Arrays.toString(oddPlacements));

	int[] even = new int[] {5, 10, 15, 20, 25, 30, 45, 15, 35, 50};
	int[] evenPlacements = evenPositions(even);
	System.out.println("The elements in odd positions are: " +  Arrays.toString(evenPlacements));

	int[] digits = {10, 20, 30, 40};
	int total = totalArray(digits);
	System.out.println("The total sum of the elements in the array is: " + total);

	String input = "madam";
	System.out.println(palindrome(input));
 
	int[] forNumbers  = {15, 5, 10, 20};
	int sumTotal = forSum(forNumbers);
	System.out.println("The forSum of the elements in the array is: " + sumTotal);

	int[] whileNumbers  = {15, 5, 10, 20};
	int whileSum = whileSumTotal(whileNumbers);
	System.out.println("The whileSum of the elements in the array is: " + whileSum);

	int[] doNumbers  = {15, 5, 10, 20};
	int doWhile = doWhileTotal(doNumbers);
	System.out.println("The doWhileSum of the elements in the array is: " + doWhile);

	char[] characters  = {'a', 'b', 'c'};
	int[] integers = {1, 2, 3};
	String[] concatenateResult = concatenate(characters, integers);
	System.out.println("The concatenate result is: " + Arrays.toString(concatenateResult));

		
	System.out.println("The combined result is: " + Arrays.toString(combined(characters, integers)));

	System.out.println("The List is : " + Arrays.toString(returnList(2342)));



}
	public static int largestElement(int[] number){
	int largest = number[0];
		for(int count = 1; count < number.length; count++){
		if(number[count] > largest){
			largest = number[count];
		}
		}
		
			return largest;
	}
	
	public static int[] reversedElements(int[] numbers){
	int[] reversed = new int[numbers.length];
	
		for(int count = 0; count < numbers.length; count++){
		reversed[count] = numbers[numbers.length - 1- count];

		}
			return reversed;
		}

	public static String elementOccurrence(int[] elements, int element){
	
		for(int count = 0; count < elements.length; count++){
		if(elements[count] == element){
		return "The element " + element + " exists in the array.";
	}
	}
		return "The element " + element + " does not exist in the array.";
}
	public static int[] oddPositions(int[] odd){
	int[] result = new int[(odd.length + 1) / 2];
    	int index = 0;
		for(int count = 1; count < odd.length; count = count + 2){
	 result[index++] = odd[count];
	}
		return result;	
}
	
	public static int[] evenPositions(int[] even){
	int[] result = new int[(even.length) / 2];
    	int index = 0;
		for(int count = 0; count < even.length; count = count + 2){
	 result[index++] = even[count];
	}
		return result;
}

	public static int totalArray(int[] digits){
	int total = 0;
		for(int count = 0; count < digits.length; count++){
	 	total += digits[count];
	}
		return total;
}

	public static String palindrome(String element){
	String result = "";
		for(int count = element.length() - 1;count >= 0; count--){
		result += element.charAt(count);	
		}
		if(result.equals(element)){
		return element+" is a palindrome";
		}
		else{
		return element+" is not a palindrome";
		}

}
	
	public static int forSum(int[] forNumbers){
	int sumTotal = 0;
		for(int count = 0; count < forNumbers.length; count++){
	 	sumTotal += forNumbers[count];
	}
		return sumTotal;
}
	
	public static int whileSumTotal(int[] whileNumbers){
	int whileSum = 0;
	int count = 0;
		while(count < whileNumbers.length){
	 	whileSum += whileNumbers[count];
		count++;
	}
		return whileSum;
}
	
	public static int doWhileTotal(int[] doNumbers){
	int doWhile = 0;
	int count = 0;
		do{
	 	doWhile += doNumbers[count];
		count++;
		}while(count < doNumbers.length);
		return doWhile;
	}
	
	public static String[] concatenate(char[] characters,int[] integers){
		String[] result = new String [characters.length + integers.length];
		for(int count = 0; count < characters.length; count++){
		result[count] = "" + characters[count];
}
		for(int count = 0; count < integers.length; count++){
		result[count + characters.length] = "" + integers[count];
	}
		return result;
	}
	public static String[] combined(char[] characters,int[] integers){
	String[] combinedResult = new String [characters.length + integers.length];
	int counter = 0 ;
		
    for (int count = 0; count < characters.length; count++) {
        combinedResult[counter] = String.valueOf(characters[count]);
        counter++;
        combinedResult[counter] = String.valueOf(integers[count]);
        counter++;
    }
		return combinedResult;
	}
	public static String[] returnList(int input){
	String stringValueOfInput = String.valueOf(input);
	String [] array = new String[stringValueOfInput.length()];
	for (int count = 0 ; count < stringValueOfInput.length(); count++){
	array[count] = String.valueOf(stringValueOfInput.charAt(count));
	}
	return array;
	}
																	
}
	