import java.util.Scanner;
public class DataFromUser {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+ " integers: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("User entered array elements: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i + " --> "+ ar[i]);
		}
		 
	}
	
}
