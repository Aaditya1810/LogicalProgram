package control1;

public class Test {

	//return statement by using non static method.
	
	public int addition(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public int subtraction(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int multiply(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public float division(int a, int b)
	{
		float c=(float) a/b;
		return c;
	}

	public static void main(String[] args) {

		//int a=20;
		//int b=50;

		Test t= new Test();
		int m= t.addition(20, 50);
		int n= t.subtraction(20, 40);
		int o= t.multiply(70, 60);
		float p= t.division(15, 23);

		System.out.println("Addition of Two nos :-" +m);
		System.out.println("Subtraction of Two nos :-" +n);
		System.out.println("Multiply of Two nos :-" +o);
		System.out.println("Division of Two nos :-" +p);
	}

}
