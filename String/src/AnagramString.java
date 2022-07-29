import java.util.Scanner;

public class AnagramString {
	 static boolean isAnagram(String s1, String s2)
	{
		 int c1[]=new int[26];
			for (int i = 0; i < s1.length(); i++)
			{
				char ch=s1.charAt(i);
				if(ch>='A'&&ch<='Z')
					c1[ch-65]++;
				if(ch>='a'&&ch<='z')
					c1[ch-97]++;
			}
			
		int c2[]=new int[26];
			for (int i = 0; i < s2.length(); i++)
			{
				char ch=s2.charAt(i);
				if(ch>='A'&&ch<='Z')
					c2[ch-65]++;
				if(ch>='a'&&ch<='z')
					c2[ch-97]++;
			}
			
			for(int i=0; i<26; i++)
			{
				if(c1[i]!=c2[i])
					return false;
			}
			return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str1=sc.nextLine();
		System.out.println("Enter second String: ");
		String str2=sc.nextLine();
		boolean sr=isAnagram(str1,str2);
		if(sr)
			System.out.println("Anagram String.");
		else
			System.out.println("Not Anagram String.");
	}
}
