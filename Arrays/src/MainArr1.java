
public class MainArr1 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int ar[]=ao.readArray();
		System.out.println("Array elements: ");
		ao.dispArray(ar);
		
		int bg=ao.getBiggest(ar);
		System.out.println("Biggest is: "+bg);
		
		int sm=ao.getSmallest(ar);
		System.out.println("Smallest is: "+sm);
		
		int sum=ao.sumOfArray(ar);
		System.out.println("Sum of elements is: "+sum);
		
		int pc=ao.countPrime(ar);
		System.out.println("Number of prime numbers: "+pc);
		
		int ct[]=ao.countEO(ar);
		System.out.println("Number of even numbers: "+ct[0]);
		System.out.println("Number of odd numbers: "+ct[1]);
	}

}
