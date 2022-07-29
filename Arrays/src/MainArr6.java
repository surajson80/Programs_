
public class MainArr6 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		
		ao.reverse(ar);
		System.out.println("After reverse: ");
		ao.dispArray(ar);
	}

}
