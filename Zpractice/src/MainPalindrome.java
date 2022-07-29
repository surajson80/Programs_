import java.util.Scanner;

public class MainPalindrome {
	static boolean checkNum(int n) //121
	{
		int sum=0,temp=n;
		do 
		{
			int d=n%10;//1
			sum=sum*10+d;
			n=n/10;		
		}while(n!=0);
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean pln=checkNum(n);
		
		if(pln==true)
			System.out.println("It is a palindrome number: ");
		else
			System.out.println("It is not a palindrome number: ");
		
	}

}
