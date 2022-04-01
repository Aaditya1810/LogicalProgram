package control1;

public class BreakStatement {

	public static void main(String[] args) {
		
		//sum of first x numbers is 325, then calculate x.
		
		int x=1;
		int sum=0;
		
		while(true)
		{
			sum=sum+x;
			
			if(sum==325)
			{
				
				break;
			}
				x++;
			}
			     System.out.println(sum);
			     System.out.println(x);
		}

	}


