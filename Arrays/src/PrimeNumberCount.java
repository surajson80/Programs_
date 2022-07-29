import java.util.Scanner;

public class PrimeNumberCount {
	
	static int readArray(int[] ar)//3,5,7,11,13
	{
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			boolean  rs = isPrime(ar[i]);
			if(rs)
				count++;
		}
		return count;
	}
	
	
	static boolean isPrime(int x)
	{
		for (int i = 2; i < x/2; i++) 
		{
			if(x%i==0)
				return false;
		}	
		return true;
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
		int count=readArray(ar);
		System.out.println("The count of prime numbers: "+count);
	}

}
