
public class MainArr2 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		
		int cnt[]=ao.countNP(ar);
		System.out.println("Number of positive number: "+cnt[0]);
		System.out.println("Number of negative number: "+cnt[1]);

	}

}
