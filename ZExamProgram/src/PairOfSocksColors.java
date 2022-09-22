
public class PairOfSocksColors {
	public static void main(String[] args) 
	{
		int n=9;
		String ar[]= {"Red","Blue","Red","Green","Red","Blue","Green","Yellow","White"};
		boolean br[]=new boolean[ar.length];
		int count=0,sum=0;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(br[i]==false)
			{
				for (int j = i+1; j < ar.length; j++) 
				{
					if(ar[j].equals(ar[i]))
					{
						br[j]=true;
						count++;
					}
				}
			}
		}
		if(count%2==0)
		{
			sum=sum+count;
		}
		System.out.println("TOTAL ALL PAIRS:"+sum);
		
	}

}
