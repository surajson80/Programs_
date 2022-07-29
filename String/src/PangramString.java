//A sentence containing every letter of the alphabet


import java.util.Scanner;
public class PangramString {
	static boolean isPangram(String str)
	{
		if(str.length()<26)
			return false;
		int count[]=new int[26];
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		for (int i = 0; i < count.length; i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}
	/*
	 * 
	 * static boolean isPangram(String str)
	{
	  	if(str.length()>26)
	  		return false;
	  	str=str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				return false;
		}		
		return true;
	}
	 *
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		boolean sr=isPangram(str);
		if(sr)
			System.out.println("Pangram String.");
		else
			System.out.println("Not Pangram String.");
	}	
}
