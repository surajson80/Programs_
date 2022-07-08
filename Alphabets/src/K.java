import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n / 2 + 1 || (i == j || i + j == n + 1) && j > n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
