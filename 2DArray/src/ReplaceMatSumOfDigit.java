import java.util.Scanner;

public class ReplaceMatSumOfDigit {
	
	private static int[][] repMatWithDigit(int[][] mat) 
	{
//		int repSum[][]=new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[0].length; j++) 
			{
				int sum=0;
				do {
					int d=mat[i][j]%10;
					sum=sum+d;
					mat[i][j]=mat[i][j]/10;
					
				}while(mat[i][j]!=0);
				mat[i][j]=sum;
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
		
		int repMat[][]=repMatWithDigit(mat);
		System.out.println("New Matrix: ");
		for (int i = 0; i < repMat.length; i++) {
			for (int j = 0; j < repMat.length; j++) {
				System.out.print(repMat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
