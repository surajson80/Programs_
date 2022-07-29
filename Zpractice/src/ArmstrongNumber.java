import java.util.Scanner;

public class ArmstrongNumber {
	
	static boolean checkNum(int x)
	{
		int p=countNum(x);
		int sum=0,temp=x;
		do
		{
			int d=x%10;
			sum=sum+pow(d,p);
			x=x/10;
		}while(x!=0);
		return sum==temp;
	}
	
	static int pow(int i, int p) 
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*i;
			p--;
		}
		return prod;
	}

	static int countNum(int x) //454
	{
		int count=0;
		while(x!=0)
		{
			x=x/10;//45//4//0
			count++;//1//2//3
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean armStrong=checkNum(n);
		if(armStrong)
			System.out.println(n+" is Armstrong Number.");
		else
			System.out.println(n+" is not Armstrong Number.");
	}

}
