import java.util.Scanner;

public class TransposeMat {
	private static int[][] transpose(int[][] mat) 
	{
		int tra[][]=new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				tra[j][i]=mat[i][j];
			}
		}
		return tra;
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
		int tmat[][]=transpose(mat);
		System.out.println("Transpose Matrix:");		
		for (int i = 0; i < tmat.length; i++) {
			for (int j = 0; j < tmat[0].length; j++) {
				System.out.print(tmat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
