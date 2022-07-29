import java.util.Scanner;

public class ArrayOperation {

	public int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		return ar;
	}

	public void dispArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public int getBiggest(int[] ar) {
		int big=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		return big;
	}

	public int getSmallest(int[] ar) {
		int small=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}

	public int sumOfArray(int[] ar) {
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
	}

	public int countPrime(int[] ar) {
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			boolean rs=isPrime(ar[i]);
			if(rs)
				count++;
		}
		return count;
	}

	private boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	public int[] countEO(int[] ar) {
		int ec=0,oc=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		int count[]= {ec,oc};
		return count;
	}

	public int[] countNP(int[] ar) {
		int nc=0,pc=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<0)
				nc++;
			else
				pc++;
		}
		int count[]= {pc,nc};
		return count;
	}

	public void updateArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int sum=0;
			while(ar[i]!=0)
			{
				int d=ar[i]%10;
				sum=sum+d;
				ar[i]=ar[i]/10;
			}
			ar[i]=sum;
		}
		
	}

	public int[] getPair(int[] ar, int n) {
		for (int i = 0; i < ar.length; i++) {
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==n)
				{
					int pair[]= {ar[i],ar[j]};
					return pair;
				}
			}
		}
		return null;
	}

	public int[] getPairIndex(int[] ar, int n) {
		for (int i = 0; i < ar.length; i++) 
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]+ar[j]==n)
					{
						int pair[]= {i,j};
						return pair;
				}
			}
		}

		return null;
	}

	public void reverse(int[] ar) {

		for (int i = 0; i < ar.length/2; i++) {
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
/*------------------------------------------
		
		for(int i=0,j=ar.length-1; i<j ; i++,j--)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
------------------------------------------*/

		
	}

	public int[] sumOfEO(int[] ar) {
		
			int sumOfEven=0,sumOfOdd=0;
			for (int i = 0; i < ar.length; i++) {
				if(ar[i]%2==0)
					sumOfEven=sumOfEven+ar[i];
				else
					sumOfOdd=sumOfOdd+ar[i];
			}
			int sum[]= {sumOfEven,sumOfOdd};
			return sum;
		
	}

	public int[] merge(int[] x, int[] y)
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) 
		{
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) 
		{
			z[i+x.length]=y[i];
		}
		return z;
	}
	

	public int[] zigZag(int[] x, int[] y) 
	{
		int z[]=new int[x.length+y.length];
		int i=0,k=0;
		while(i<x.length&&i<y.length)
		{
			z[k++]=x[i];// 0 0//2 1
			z[k++]=y[i++];//1 0//3 1
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(i<y.length)
			z[k++]=y[i++];
		
		return z;
	}

	public int[] mergeSrt(int[] x, int[] y) {
		
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length)
		{
			if(x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}

	public int[] insertArr(int[] x, int ele, int in)
	{
		if(in<0||in>x.length)
		{
			System.out.println("index not in range:");
			return x;
		}
		int y[]=new int[x.length+1];
		    y[in]=ele;
		for (int i = 0; i < x.length; i++) {
			if(i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
	}

	public void sumOfSqrOfDigit(int[] ar) 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			while(ar[i]>9)
			{
				int sum=0;
					while(ar[i]!=0)
					{
						int d=ar[i]%10;
						sum=sum+d*d;
						ar[i]=ar[i]/10;
					}
				ar[i]=sum;
			}
			
		}
	}

}
