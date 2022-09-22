import java.util.Scanner;

public class ReverseMatRowWise {
	
	 static int[][] reverseMatRowWise(int[][] mat) 
	{
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length/2; j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[0].length-1-j];
				mat[i][mat[0].length-1-j]=temp;
			}
		}
		return mat;
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
		
		int rev[][]=reverseMatRowWise(mat);
		System.out.println("Reverse matrix row wise:");
		for (int i = 0; i < rev.length; i++) {
			for (int j = 0; j < rev[0].length; j++) {
				System.out.print(rev[i][j]+" ");
			}
			System.out.println();
		}
	}
}
