package practice;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0; i<=10; i++)
		{
			if(i == 9)
			{
				continue;
			}
			    sum= sum + i;
		}
		   System.out.println(sum);
	}
}
