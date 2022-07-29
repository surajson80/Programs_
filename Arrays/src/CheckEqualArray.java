
public class CheckEqualArray {
	
	static boolean checkArr(int ar[],int br[])
	{
		int a=ar.length;
		int b=br.length;
		if(a==b)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int ar[]= {12,23,34,45,56,67,78};
		int br[]= {23,34,45,56,67,78,89};
		boolean cr=checkArr(ar,br);
		if(cr)
			System.out.println("Arrays are equals.");
		else
			System.out.println("Arrays are not equals.");
	}
}
