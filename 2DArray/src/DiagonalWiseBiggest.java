import java.util.Scanner;
public class DiagonalWiseBiggest {
	private static int[] diagonalWiseBig(int[][] mat) 
	{
		int pbig=mat[0][0],sbig=mat[0][mat.length-1];
		for (int i = 0; i < mat.length; i++) 
		{
			 if(mat[i][i]>pbig)
				 pbig=mat[i][i];
			 if(mat[i][mat.length-1-i]>sbig)
				 sbig=mat[i][mat.length-1-i];
		}
		int big[]= {pbig,sbig};
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
		
		int rev[]=diagonalWiseBig(mat);
		System.out.println("Biggest num of primary diagonal: "+rev[0]);
		System.out.println("Biggest num of secondary diagonal: "+rev[1]);
	}
}
