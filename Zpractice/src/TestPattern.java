import java.util.*;
public class TestPattern 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = n; j >= 1+n-i; j--)
            {
                System.out.print(j);
            }
            for (int j= i*2 ; j < n*2-1; j++)
            {
                System.out.print(" ");
            }
            for (int l = 1+n-i; l <=n; l++)
            {
                if(l!=1)
                    System.out.print(l);
            }
            System.out.println();
        }
	}
}
