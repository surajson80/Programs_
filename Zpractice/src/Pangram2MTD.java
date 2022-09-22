import java.util.Scanner;

public class Pangram2MTD {
	private static boolean checkPangram(String str) 
	{		
		if(str.length()<26)
			return false;
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		boolean rs=checkPangram(str);
		if(rs)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}

	
}
