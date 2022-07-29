import java.util.Scanner;

public class CountDigitIntoString {
	static int countOfDigits(String str) 
	{
		String num="1234567890";
		char ch[]=str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(num.indexOf(ch[i])>=0)
				count++;			
		}	
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		System.out.println("Number of Digits: "+countOfDigits(str));
	}
}
