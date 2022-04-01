package practice;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);   //add to digit in number

	System.out.println("Enter a Number :- ");
	
	int number= sc.nextInt();
	
	int remainder=0;
	
	while(number>0)
	{
		remainder= remainder + number % 10;
		
		number= number/10;
	}
	    System.out.println("Addition of digit " + remainder);
	
	}
}