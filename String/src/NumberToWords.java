import java.util.Scanner;
public class NumberToWords {
	private static void nm(int n, String st)
	{
		String fd[]= { "","one","two","three","four","five","six","seven","eight","nine","ten","Eleven","tweleve","thirteen","fourteen","fifteen","Sixteen","Seventeen","eighteen","nineteen"};
		String ld[]= {"","","twenty","thirty","fouty","fifty","sixty","seventy","eighty","ninty"};
		
		if(n<20)
			System.out.print(fd[n]);
		else
			System.out.print(ld[n/10]+fd[n%10]);
		
		if(n!=0)
			System.out.print(st+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();//364354623
		sc.close();
		nm(n/10000000," caror");//36
		nm(n/100000%100," lakh");
		nm(n/1000%100," thousand");
		nm(n/100%10," hundred");
		nm(n%100," ");		
	}	
}
