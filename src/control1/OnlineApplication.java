package control1;

import java.util.Scanner;

public class OnlineApplication {

	public boolean Uname()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Username :-");
		String uname = sc.nextLine();

		if (uname.equals("Oracle"))
		{
			System.out.print("Enter the Password :-");
			String password = sc.nextLine();
			if (password.equals("Pass"))
			{
				System.out.println("Successfully LogIn....!!!\n");
				return true;

			}
			else 
			{
				System.out.println("Your Password is Incorrect...!!!");

			}
		} 
		else 
		{
			System.out.println("Enter the Correct UserName....!!!");

		}

		return false;
	}

	public void m2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Dish :-");
		int a = sc.nextInt();
		System.out.print("Enter the second Dish :-");
		int b = sc.nextInt();
		System.out.print("Enter the third Dish :-");
		int c = sc.nextInt();
		int sum = a + b + c;
		System.out.println("Total Dishes are calculate Rs = " + sum);

		if (sum >= 150) 
		{
			if (sum >= 300) 
			{
				System.out.println("Free Delivery");
				System.out.println("Total Amount Rs = " + sum);
			} 
			else 
			{
				System.out.println("Delivery Charges to 35 Rs + Total Charges Rs = " + (35 + sum));
			}
		} 
		else 
		{
			System.out.println("Order not placed");
		}
	}

	public static void main(String[] args) 
	{

		OnlineApplication a = new OnlineApplication();

		System.out.println("Welcome To Online Food Delivery Application:-");
		
		System.out.println("************************************************");

		if(a.Uname());
		{
			a.m2();

		}

	}


}