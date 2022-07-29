import java.util.Scanner;

public class SumOfElements {
	
	static int readArray(int[] ar)//2,3,4,5,6
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
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
		int sum=readArray(ar);
		System.out.println("Sum of elements: "+sum);
	}
}
