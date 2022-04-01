package control1;

import java.util.Arrays;
import java.util.Scanner;

public class DesendingOrder {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int size=sc.nextInt();
		
		int a[]= new int [size];
		
		
		//int a[]= {33,55,11,30,99,75};
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter " + i +"Number");
			
			a[i]=sc.nextInt();
			{
			for(int j=i+1; j<size; j++)
			{
				
				if(a[j] > a[i])
				{
					int z =a[i];
					
					a[i]= a[j];
					
					a[j]= z;
					
				System.out.println(size);	

				}
			}
			}	}
		System.out.println(Arrays.toString(a));
		    
	}

}
