public class MainMatrix {
	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int mat[][]=mt.readMatrix();
		mt.dispMatrix(mat);
		System.out.println("Biggest element is: "+mt.getBiggest(mat));
		System.out.println("Smallest element is: "+mt.getSmallest(mat));
		System.out.println("Sum of Matrix Elements: "+mt.sumOfMat(mat));
	}
}
