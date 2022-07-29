
public class InsertElementSpecifiedIndex {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArray();
		System.out.println("User entred first array: ");
		ao.dispArray(a);
		
		int c[]=ao.insertArr(a,39,3);
		System.out.println("after insert element:");
		ao.dispArray(c);
	}

}
