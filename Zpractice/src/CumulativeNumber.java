import java.util.Scanner;

public class CumulativeNumber {
	
	static void checkNum(int x)//5
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
			System.out.print(sum+" ");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Cumulative Numbers are:");
		checkNum(n);
	}

}
