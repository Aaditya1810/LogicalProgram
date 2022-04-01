package velocity;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=20, sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Chice :-");
		 sum= sc.nextInt();
		
		switch(sum)
		{
		case 1:
			System.out.println("Sum of two nos = " + (a+b));
			break;
			
		case 2:
			System.out.println("Multiplication of two nos = " + (a*b));
			break;
			
		case 3:
			System.out.println("Division of two nos = " + (a%b));
			break;
		
		default:
		     System.out.println("Invalid choice");
		}
	}

}
