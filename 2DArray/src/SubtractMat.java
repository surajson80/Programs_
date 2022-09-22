import java.util.Scanner;

public class SubtractMat {
	private static int[][] subtractMat(int[][] mat1, int[][] mat2) 
	{
		if (mat1.length!=mat2.length||mat1[0].length!=mat2[0].length) 
		{
			System.out.println("Order must be same:");
			return null;
		}
		int mat3[][]=new int[mat1.length][mat1[0].length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				mat3[i][j]=mat1[i][j]-mat2[i][j];
			}
		}
		return mat3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the Matrix: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		System.out.println("Enter the "+row*col+" elements to 1st Matrix:");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("User entered 1st Matrix is:");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the "+row*col+" elements to 2nd Matrix:");
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("User entered 2nd Matrix is:");
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		int mat[][]=subtractMat(mat1,mat2);
		System.out.println("Subtraction of Matrix is:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
