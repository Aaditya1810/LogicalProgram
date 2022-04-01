package practice;

public class C {

	public static void main(String[] args) {
	
		//m1();
		//System.out.println();
		m2();
	}
		public static void m1()
		{
		
	   	for(int i=0;i<9; i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=(9-i); j>i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		}
		   public static void m2()
		   {

		for(int i=0; i<9; i++)
		{
			for(int j=9; j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=(9-i); j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
	





