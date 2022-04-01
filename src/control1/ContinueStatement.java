package control1;

public class ContinueStatement {

	public static void main(String[] args) {
		
		//Question  : Addition of first 10 numbers except 8;
		
		int sum=0;
		
		for(int i=0;i<=10;i++)
		{
			if(i==10)
			{
				continue;
			}
			    sum = sum+i;
			
		}
		      System.out.println(sum);

	}

}
