import java.util.Scanner;

public class SmallestElements {
	static int readArray(int[] ar)//2,4,6,9,78
	{
		int small=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+ " integers: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int small=readArray(ar);
		System.out.println("Smallest elements is: "+small);
	}

}
