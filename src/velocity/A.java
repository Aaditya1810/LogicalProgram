package velocity;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Week Days :-");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday and Sunday Weekly Off");

		
		}
		
	}

}
