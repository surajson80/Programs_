import java.util.Scanner;

public class EvenOdd {
	static boolean checkNum(int x)
	{
		if(x%2==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		boolean eo=checkNum(n);
		if(eo)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
	}

}
