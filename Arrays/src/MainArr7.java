
public class MainArr7 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		
		int sum[]=ao.sumOfEO(ar);
		System.out.println("Sum of even numbers: "+sum[0]);
		System.out.println("Sum of odd numbers: "+sum[1]);
	}

}
