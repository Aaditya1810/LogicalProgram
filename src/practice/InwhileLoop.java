package practice;

public class InwhileLoop {

	public static void main(String[] args) {
		
		//Add to didit in number
		
		int number=3456;
		int remainder=0;
		
		while(number>0)
		{
			remainder= remainder+ number%10;
			
			number = number/10;
		}
		
		System.out.println("Addition of Digits = " +remainder);
	}
}
