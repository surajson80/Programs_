import java.util.Scanner;

public class FactorialNumber {//5
	
	static int checkNum(int x)
	{
		int fact=1;
		while(x>1)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		int fnum=checkNum(n);
		System.out.println("Factorial of "+n+" is: "+fnum);
	}
}
