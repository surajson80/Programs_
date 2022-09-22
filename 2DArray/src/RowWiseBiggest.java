import java.util.Scanner;

public class RowWiseBiggest {
	
	private static int[] rowwiseBig(int[][] mat) 
	{
		int big[]=new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			int bg=mat[i][0];
			for (int j = 0; j < mat.length; j++) 
			{
				if(mat[i][j]>bg)
					bg=mat[i][j];
			}
			big[i]=bg;
		}
		return big;
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
		
		int big[]=rowwiseBig(mat);
		System.out.println("Biggest Element Row Wise:");
		for (int i = 0; i < big.length; i++) 
		{
			System.out.print(big[i]+" ");
		}
	}
}
