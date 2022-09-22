import java.util.Scanner;
public class PositiveEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter positive number: ");
		int n=sc.nextInt();
		if((n&1)==0)//5&1=1
			System.out.println("even");
		else
			System.out.println("odd");

		
	}
}
