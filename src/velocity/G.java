package velocity;

import java.util.Scanner;

public class G {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int a=sc.nextInt();
		
		
		for(int i=a; i>=1; i--)
		{
			for(int j=a-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print("* ");
			}
			  
			   System.out.println();
		}
	}

}
