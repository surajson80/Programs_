
public class Get3PairsProgram 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,4,5,7,8,10};
		int defValue=3;
		
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				for (int k = j+1; k < ar.length; k++) 
				{
					if(ar[k]-ar[i]==defValue&&ar[j]-ar[i]==defValue)
						System.out.print(ar[i]+" "+ar[j]+" "+ar[k]);
				}
			}
		}
	}
}
