package practice;


public class D {
	
	public static void main(String[] args) {
		
		m1();
		//System.out.println();
		m2();
		
		
	}
		public static void m1()
		{
		
		for(int i=0;i<6;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			  for(int j=0;j<=i;j++)
			  {
				  System.out.print("*");
			  }
			  
			      System.out.println();
		}
		}
		
		public static void m2()
		{
		   for(int i=0; i<5;i++)
		   {
			  for(int j=0;j<=i;j++)
			  {
				  System.out.print(" ");
			  }
			     for(int j=5; j>i; j--)
			     {
			    	 System.out.print("*");
			     }
			        System.out.println();
		   }
	}
		
	
}
