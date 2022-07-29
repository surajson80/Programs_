import java.util.Scanner;

public class PrimeNumber {
	static boolean checkNum(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(i%2==0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		boolean pr=checkNum(n);
		
		if(pr)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
