
public class MergeSortArray {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArray();
		int b[]=ao.readArray();
		System.out.println("User entred first array: ");
		ao.dispArray(a);
		System.out.println("User entred second array: ");
		ao.dispArray(b);
		
		int c[]=ao.mergeSrt(a,b);
		System.out.println("after merge array:");
		ao.dispArray(c);
	}
}
