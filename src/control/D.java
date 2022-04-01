package control;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the firt number");
		int a= sc.nextInt();
		System.out.print("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		if(a>=b)
		{
			if(a>b)
			{
			System.out.println("A is large");
			}
			else
			{
				System.out.println("both are same");
			}
		}
			else
			{
				System.out.println("B is large");
			}
		}
	}

