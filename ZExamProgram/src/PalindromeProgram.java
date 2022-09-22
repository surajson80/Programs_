import java.util.Scanner;

public class PalindromeProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		int sum=0;
		int k=n;
		do {
			int d=k%10;
			sum=sum*10+d;
			k=k/10;
		}while(k!=0);
		if(sum==n)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
}
