import java.util.Scanner;

public class PalindromeString {
	static boolean palindromeString(String str)//saras
	{
		char ch[]=str.toCharArray();
		char newch[]=new char[ch.length];
		int j=0;
		for (int i = ch.length-1; i >= 0; i--)
		{
			newch[j]=ch[i];
			j++;
		}
		String s1=new String(newch);
		if(s1.equalsIgnoreCase(str))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		boolean result=palindromeString(str);
		if(result)
			System.out.println("Palindrome String.");
		else
			System.out.println("Not Palindrome String.");
	}
}
