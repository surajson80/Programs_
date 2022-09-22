/*
public class SearchNumber5 
{
	 
	public static void main(String[] args) 
	{
		int startIndex=100;
		int endIndex=200;

		for (int i = startIndex; i <= endIndex; i++) 
		{
//			int k=i;
//			for(int j=0;j<3;j++)
//			{
//				int d=k%10;
//				if(d==5)
//					System.out.print(i+",");
//				k=k/10;
//			}
			
		
			
			int j=0;
			int k=i;
			while(j<3)
			{
				int d=k%10;
				if(d==5)
					System.out.print(i+",");
				k=k/10;
				j++;    
			}    
		}
	}
}


*/






/*
public class SearchNumber5
{
	 static void checkNum(int x, int y) 
	 {
		 int k=x;
		for (int i = 0; i < 3; i++) 
		{
			int d=k%10;
			if(d==y)
				System.out.print(x+",");
		    k=k/10;
		}
		
	}
	
		public static void main(String[] args) 
		{
			int startIndex=100;
			int endIndex=200;
			 for (int i = startIndex; i < endIndex; i++) 
			{
				checkNum(i,5);
			}
		}

		
}

*/


public class SearchNumber5
{
	public static void main(String[] args) 
	{
		int startIndex=100;
		int endIndex=200;
		
		for (int i = startIndex; i < endIndex; i++) 
		{
			int k=i;
			int j=0;
			while(j<3) 
			{
				int d=k%10;
				if(d==5)
				{
					System.out.println(i+",");
					break;
				}
				k=k/10;
				j++;
			}
		}
	}
}

















