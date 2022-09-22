
public class RemoveDuplicateProgram 
{
	public static void main(String[] args) 
	{
		int ar[]= { 10,20,20,30,30,40,50,50};
		boolean br[]=new boolean[ar.length];
		int cr[]=new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(br[i]==false)
			{
				cr[i]=ar[i];
				for (int j = i+1 ; j < br.length; j++) 
				{
					if(ar[i]==ar[j])
					{
						br[j]=true;
					}
					
				}
			}
		}
		
		for (int i = 0; i < cr.length; i++) 
		{
			if(cr[i]!=0)
				System.out.print(cr[i]+" ");
		}
	}
}
