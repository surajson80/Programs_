import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||i==n/2+1||(j==n&&i<n/2+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
