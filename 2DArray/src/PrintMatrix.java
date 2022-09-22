public class PrintMatrix 
{
	public static void main(String[] args) 
	{
		int mat[][]= {{23,45,65,78},{21,24,54,57},{11,22,33,44}};
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("No. of Rows: "+mat.length);
		System.out.println("No. of colomns: "+mat[0].length);
	}
}
