import java.util.Scanner;

public class MainStr7 {
	static boolean isPalindrome(String str)//suraj
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		boolean pl=isPalindrome(str);
		if(pl)
			System.out.println("Palindrome String.");
		else
			System.out.println("Not Palindrome String.");
	}	
}
