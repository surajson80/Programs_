
public class DeleteElementSpecifiedIndex {
	
	 int[] deleteElement(int[] ar, int in) 
	{
		 if(in<0||in>=ar.length)
			{
				System.out.println("index is not in range");
				return ar;
			}
		 int br[]=new int[ar.length-1];
		 for (int i = 0; i < ar.length-1; i++) 
		 {
			if(i<in)
				br[i]=ar[i];
			else
				br[i]=ar[i+1];
		 }	 
		return br;
	}
	
	public static void main(String[] args) {
		DeleteElementSpecifiedIndex d=new DeleteElementSpecifiedIndex();
		int ar[]= {12,15,78,45,65,80};
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");	
		}
		System.out.println();
		System.out.println("After delete the element:");
		int cr[]=d.deleteElement(ar, 3);
		for (int i = 0; i < cr.length; i++) 
		{
			System.out.print(cr[i]+" ");
		}
	}
}
