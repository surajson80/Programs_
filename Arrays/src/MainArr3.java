
public class MainArr3 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		ao.updateArr(ar);
		System.out.println("After update: ");
		ao.dispArray(ar);
	}

}
