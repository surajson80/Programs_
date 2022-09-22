import java.util.Scanner;

public class PalindromeString {
	
	static boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(ch2!=ch1)
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		boolean st=isPalindrome(str);
		System.out.println(st);
		
	}

}
