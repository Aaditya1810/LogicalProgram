package control;

import java.util.Scanner;

public class Stringif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Username :-");
		String uname= sc.nextLine();
		
		
		
		if(uname.equals("Oracle"))
		{
			System.out.print("Enter the Password :-");
			String password= sc.nextLine();
			
			if(password.equals("Pass"))
			{
				System.out.println("Successfully LogIn....!!!");
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
		
					
		}
	}


