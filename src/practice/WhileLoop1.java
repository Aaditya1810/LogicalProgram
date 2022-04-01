package practice;

public class WhileLoop1 {
	
	public static void main(String[] args) {
		
		int x=1;
		int sum=0;
		
		while(true)
		{
			sum= sum+x;    
			
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
