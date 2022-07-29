import java.util.Scanner;

public class SpecialTwoDigitNumber {
	
	static boolean checkNum(int x)//45
	{
		int d1=x%10,d2=x/10;
		int d3=d1+d2+d1*d2;
		return d3==x;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean spn=checkNum(n);
		if(spn)
			System.out.println(n+" :is Special Two Digit Number.");
		else
			System.out.println(n+" :is not Special Two Digit Number.");
	}

}
