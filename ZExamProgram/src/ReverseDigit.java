import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		String rs="";
		do {
			int d=n%10;
			rs=rs+d;
			n=n/10;
		}while(n!=0);
		System.out.println("Reverse Number: --> "+rs);
	}

}
