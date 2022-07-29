
public class OneArrInsideArr {
	 static int[] insertArr(int[] ar, int[] br, int in) 
	{
		if(in<0||in>=ar.length)
		{
			System.out.println("index is not in range");
			return ar;
		}
		int cr[]=new int[ar.length+br.length];
		for (int i = 0; i < br.length; i++) 
		{
			cr[in+i]=br[i];
		}
		for (int i = 0; i < ar.length; i++) 
		{
			if( i<in)
				cr[i]=ar[i];
			else
				cr[i+br.length]=ar[i];
		}
		return cr;
	}
	public static void main(String[] args) {
		int ar[]= {23,34,45,56,67};
		int br[]= {11,22,33};
		int check[]=insertArr(ar,br,3);
		for (int i = 0; i < check.length; i++) 
		{
			System.out.print(check[i]+" ");
		}
	}	
}
