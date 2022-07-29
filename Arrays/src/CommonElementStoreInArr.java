
public class CommonElementStoreInArr {
	
	 int[] common(int ar[],int br[])
	{
		int cr[]=new int[ar.length];
		int k=0;
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < br.length; j++) 
			{
				if(ar[i]==br[j])
				{
					cr[k++]=ar[i];
				}	
			}
		}
		int rs[]=new int[k];
		for(int i=0;i<k;i++)
		{
			rs[i]=cr[i];
		}
		return rs;
	}
	
	public static void main(String[] args) {
		CommonElementStoreInArr ce=new CommonElementStoreInArr();
		int ar[]= {12,23,34,45,56,67,89};
		int br[]= {11,22,23,44,45,55,56,89};
		int print[]=ce.common(ar,br);
		System.out.println("Common elements.");
		for (int i = 0; i < print.length; i++) 
		{
			System.out.print(print[i]+" ");
		}
	}
}
