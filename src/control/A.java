package control;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First No a is:-");
		int a=sc.nextInt();
		System.out.println("Enter the Second No b is :-");
		int b=sc.nextInt();
		
		//Two numbers find large no
		
		if(a>=b)
		{
			if(a>b)
			{
				System.out.println("A is large");
				
			}
			else
			{
				System.out.println("Both are same");
			}
			
		}
		else
		{
			System.out.println("B is large");
		}
	}
}
