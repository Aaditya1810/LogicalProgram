package control1;

public class ReturnStatement {

	//return statement by using static method.

	public static int addition(int a, int b)
	{
		//int a=40;
	//	int b=30;
		int result= a+b;

		return result;
	}

	public static int subtraction(int a, int b)
	{
	//	int a=40;
	//	int b=30;
		int result= a-b;

		return result;
	}

	public static int multiplication(int a, int b)
	{
		//int a=40;
		//int b=30;
		int result= a*b;

		return result;
	}
	  public static float divede(float a, float b)
	  {
		  float result =(float) a/b;
		  return result;
	  }
	    

	public static void main(String[] args) {

		int a=40;
		int b=30;
		int k=addition(a,b);
		System.out.println(k);
		int l=subtraction(a,b);
		System.out.println(l);
		int m=multiplication(a,b);
		System.out.println(m);
		float s=(float) divede(a,b);
		System.out.println(s);
		
		
	}
}
