import java.util.Scanner;

public class PrimeNumIntoMat {
	
	private static int primeNumIntoMat(int[][] mat) 
	{
		int count=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				boolean rs=isPrime(mat[i][j]);
				if(rs==true)
					count++;
			}
		}
		return count;
	}
	
	private static boolean isPrime(int x) 
	{
		for (int i = 2; i <=x/2; i++) 
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the Matrix: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("Enter the "+row*col+" elements:");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("User entered Matrix is:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		int rs=primeNumIntoMat(mat);
		System.out.println("No of Prime Numbers: "+rs);
	}

	
}