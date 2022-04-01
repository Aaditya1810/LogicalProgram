package control;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the First No A is :-");
		int a=sc.nextInt();
		System.out.print("Enter the Second No B is :-");
		int b=sc.nextInt();
		System.out.print("Enter the Third No C is :-");
		int c=sc.nextInt();

		//To Find the maximum no

		if(a >= b)
		{
			
			if(a==b)
			{
				if(a==c)
				{
					System.out.println("a, b and c are equal");
				}
				else
				{
					if(a < c)
					{
						System.out.println("c is large");
					}
					else
					{
						System.out.println("a and b are equal and large");
					}
				}
			}
			else
			{
				if(a >= c)
				{
					if(a == c) {
						System.out.println("a and c are equal and large");
					}
					else
					{
						System.out.println("a is large");
					}
				}
				else 
				{
					System.out.println("c is large");

				}
			}
		}


		else
		{
			if(b >= c)
			{
				if(b == c)
				{
					System.out.println(" b and c are equal and large");
				}
				else
				{
					System.out.println("b is large");
				}
			}
			else
			{
				System.out.println("c is large");

			}

		}
	}
}


		