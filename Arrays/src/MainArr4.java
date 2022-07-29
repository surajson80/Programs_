
public class MainArr4 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		
		int pr[]=ao.getPair(ar,15);
		if(pr==null)
			System.out.println("There is no pair.");
		else
			System.out.println(pr[0]+","+pr[1]);
	}

}
