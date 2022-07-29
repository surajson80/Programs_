import java.util.Scanner;

public class AverageOfElements {
	static double readArray(int[] ar)
	{
		double sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum/ar.length;
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
		double avg=readArray(ar);
		System.out.println("The average of elements: "+avg);
	}

}
