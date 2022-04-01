package control;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first Dish :-");
		int a= sc.nextInt();
		System.out.print("Enter the second Dish :-");
		int b=sc.nextInt();
		System.out.print("Enter the third Dish :-");
		int c=sc.nextInt();
		
	//	System.out.println("Total Dishes  :-");
		
		int sum=a+b+c;
		System.out.println("Total Dishes are calculate Rs = " +sum);
		
		if(sum>=150)
		{
			if(sum>=300)
			{
				System.out.println("Free Delivery");
				System.out.println("Total Amount Rs = " + sum);
			}
			else
			{
				System.out.println("Delivery Charges to 35 Rs + Total Charges Rs = " + ( 35 + sum ));
			}
		}
		else
		{
			System.out.println("Order not placed");
		}
}
}