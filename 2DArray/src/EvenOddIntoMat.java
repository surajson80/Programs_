import java.util.Scanner;

public class EvenOddIntoMat {
	
	private static int[] evenOdd(int[][] mat) 
	{
		int ec=0,oc=0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int ar[]= {ec,oc};
		return ar;
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
		
		int ar[]=evenOdd(mat);
		System.out.println("No of Even Elements: "+ar[0]);
		System.out.println("No of Odd Elements: "+ar[1]);
	}

	
}
