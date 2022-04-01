package control;

import java.util.Scanner;

public class GradeCalculate {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Student Percentage");
		float a= sc.nextFloat();
		
		if(a>=90)
		{
			System.out.println("Student grade is A+");
		}
		else if(a>=80)
		{
			System.out.println("Student grade is A");
		}
		else if(a>=70)
		{
			System.out.println("Student grade is B");
		}
		else if(a>=60)
		{
			System.out.println("Student grade is C");
		}
		else if(a>=50)
		{
			System.out.println("student grade is D");
		}
		else if(a>=40)
		{
			System.out.println("Student grade is E");
		}
		else
		{
			System.out.println("Student is Fail");
		}

	}
}
