import java.util.Scanner;
public class NumberIntoWord 
{
	private static void nw(int n, String st) 
	{
		String fd[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String sd[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if(n<20)
		{
			System.out.print(fd[n]);
		}
		else
		{
			System.out.print(sd[n/10]+fd[n%10]);
		}
		if(n!=0)
			System.out.print(st+" ");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		int x=sc.nextInt();//12345678
		nw(x/10000000," caror");
		nw(x/100000%100," lakh");
		nw(x/1000%100," thousand");
		nw(x/100%10," hundred");
		nw(x%100," ");
		

	}

}
