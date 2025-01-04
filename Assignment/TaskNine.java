public class TaskNine{
	public static void main(String[] args){
	int total = 0;
	
	for(int counter = 1;counter <= 10; counter++){
		int number = 1;
		
		if(counter % 4 == 0){
			for(int count = 1;count <= 5; count ++){
				number = counter*number;
				total += number;
			
			}
				
		}
		
				
	}
			System.out.print((total * total) + " ");	
	}
			
}