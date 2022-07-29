
public class SumOfSquareOfDigit {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("User entred array: ");
		ao.dispArray(ar);
		
		ao.sumOfSqrOfDigit(ar);
		System.out.println("after reducing the array:");
		ao.dispArray(ar);
	}

}
