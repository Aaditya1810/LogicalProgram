package velocity;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();

		for(int i=0; i<=a;i++)
		{
			for(int j=0; j<=(a-i); j++)
			{
				System.out.print("* ");
			}
			    System.out.println();
		}
	}

}
