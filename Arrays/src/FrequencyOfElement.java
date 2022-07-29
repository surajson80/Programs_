
public class FrequencyOfElement {
	public static void main(String[] args) {
		int ar[]= {23,45,67,89,45,34,56,45,89,23};
		//        {f ,f ,f ,f ,t ,f ,f ,t ,t ,t }
		boolean br[]=new boolean[ar.length];
		for (int i = 0; i < ar.length; i++) 
		{
			if(br[i]==false)
			{
				int count=1;
				for (int j = i + 1; j < ar.length; j++) 
				{
					if(ar[i]==ar[j])
					{
						br[j]=true;
						count++;
					}
				}
				System.out.println(ar[i]+" -> "+count);
			}
		}
	}
}


class FrequencyOfElementWithoutComparision {
	public static void main(String[] args) {
		int ar[]= {23,45,67,89,45,34,56,45,89,23};
		
		int big=ar[0];
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>big)
				big=ar[i];
		}
		int count[]=new int[big+1];
		for (int i = 0; i < ar.length; i++) 
		{
			count[ar[i]]++;// count[23]
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.println(i+" -> "+count[i]);
		}
	}
}











