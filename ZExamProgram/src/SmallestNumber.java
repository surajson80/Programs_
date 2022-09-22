public class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int ar[]= {67, 26, 96, 19, 67};
		int small=ar[0];
		
		for (int i = 1; i < ar.length; i++) 
		{
			if(ar[i]<small)
				small=ar[i];
		}
		System.out.println("Smallest Element: "+small);
	}
}
