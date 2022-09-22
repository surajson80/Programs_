import java.util.Scanner;
public class Matrix {
	public int[][] readMatrix() 
	{
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
		return mat;
	}
	public void dispMatrix(int[][] mat) 
	{
		System.out.println("User entered Matrix is:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public int getBiggest(int[][] mat) 
	{
		int big=mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
	
		return big;
	}
	public int getSmallest(int[][] mat) 
	{
		int small=mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]<small)
					small=mat[i][j];
			}
		}
	
		return small;
	}
	public int sumOfMat(int[][] mat) 
	{
		int sum=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum=sum+mat[i][j];
			}
		}
		return sum;
	}
}
