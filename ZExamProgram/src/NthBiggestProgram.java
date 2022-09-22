
public class NthBiggestProgram 
{
	public static void main(String[] args)
	{
		int ar[]= {78, 33, 15, 34, 86};
		int nthBig=3;
		
		for (int i = 0; i < ar.length; i++) 
		{
			int count=0;
			for (int j = 0; j < ar.length; j++) 
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==nthBig-1)
				System.out.println(nthBig+"rd Big Element: "+ar[i]);
		}
	}
}
