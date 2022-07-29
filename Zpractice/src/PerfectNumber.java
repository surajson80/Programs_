import java.util.Scanner;

public class PerfectNumber {
	
	static boolean checkNum(int x)
	{
		int sum=0,temp=x;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		return temp==sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		boolean pnum=checkNum(n);
		if(pnum)
			System.out.println(n+" :is a Perfect Number.");
		else
			System.out.println(n+" :is not a Perfect Number.");
	}

}
