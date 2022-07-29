
public class NthBiggestElement {
	 static int checkBig(int[] ar,int n) 
	 {
		for (int i = 0; i < ar.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < ar.length; j++) 
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,56,67,89,112};
		int big=checkBig(ar,4);
		System.out.println(big);
	}


}
