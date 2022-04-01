package velocity;

import java.util.Scanner;

public class F {

	//start pattern program to print traingle or pyramid
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		
		
		for (int i=1; i<=a; i++)
		{
			for(int j=a-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print("* ");
			 }
			    System.out.println();
				
			}
		}
}
