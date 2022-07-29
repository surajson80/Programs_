import java.util.Scanner;

public class StrongNumber {
	static int fact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	static boolean checkNum(int x)
	{
		int sum=0,temp=x;
		do
		{
			int p=x%10;
			sum=sum+fact(p);
			x=x/10;
		}while(x!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean strong=checkNum(n);
		if(strong)
			System.out.println(n+" is a Strong Number.");
		else
			System.out.println(n+" is not a Strong Number.");
	}
}
