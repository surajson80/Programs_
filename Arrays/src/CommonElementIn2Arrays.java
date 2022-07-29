
public class CommonElementIn2Arrays {
	
	static void common(int ar[],int br[])
	{
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < br.length; j++) 
			{
				if(ar[i]==br[j])
				{
					System.out.print(ar[i]+", ");
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,56,67,89};
		int br[]= {11,22,23,44,45,55,56,89};
		common(ar,br);
	}
}
