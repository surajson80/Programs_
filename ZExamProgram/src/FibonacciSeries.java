import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();

		int sum;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		for (int i = 0; i < n; i++) 
		{
			sum=num1+num2;//0+1
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
	}

}
