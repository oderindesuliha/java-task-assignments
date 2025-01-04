public class TaskSeven{
	public static void main(String[] args){

	for(int counter = 1; counter<= 10; counter++){
		int number = 1;
		int total = 0;
		if(counter % 4 == 0){
			for(int count = 1;count <= 5; count ++){
				number = counter*number;
				total +=number;
			
			}
			System.out.print(total + " ");		
		}

	}

	}


}