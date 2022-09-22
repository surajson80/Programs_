import java.util.Scanner;

public class Rotate90RightMat {
	
	private static int[][] rotateRight(int[][] mat) 
	{
		int rev[][]=new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				rev[j][i]=mat[i][j];
			}
		}
		
		for (int i = 0; i < rev.length; i++) {
			for (int j = 0; j < rev[i].length/2; j++) {
				int temp=rev[i][j];
				rev[i][j]=rev[i][rev[0].length-1-j];
				rev[i][rev[0].length-1-j]=temp;
			}
		}
		return rev;
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
		
		int rev[][]=rotateRight(mat);
		System.out.println("Rotate 90 Right :");
		for (int i = 0; i < rev.length; i++) {
			for (int j = 0; j < rev[0].length; j++) {
				System.out.print(rev[i][j]+" ");
			}
			System.out.println();
		}
	}

	
}
