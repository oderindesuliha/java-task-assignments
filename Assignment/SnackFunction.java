public class SnackFunction{


	public static void main(String [] args){
		System.out.println(logisticsServices(25));
		System.out.println(logisticsServices(56));
		System.out.println(logisticsServices(62));
		System.out.println(logisticsServices(80));
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