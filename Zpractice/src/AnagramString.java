import java.util.Scanner;
public class AnagramString {
	private static boolean isAnagram(String st1, String st2) 
	{
		int count1[]=new int[26];
		for (int i = 0; i < st1.length(); i++) 
		{
			char ch=st1.charAt(i);
			if(ch>='A'&&ch<='Z')
				count1[ch-65]++;
			if(ch>='a'&&ch<='z')
				count1[ch-97]++;
		}
		
		int count2[]=new int[26];
		for (int i = 0; i < st2.length(); i++) 
		{
			char ch=st2.charAt(i);
			if(ch>='A'&&ch<='Z')
				count2[ch-65]++;
			if(ch>='a'&&ch<='z')
				count2[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String st1=sc.nextLine();
		System.out.println("Enter the 2nd String: ");
		String st2=sc.nextLine();
		
		boolean rs=isAnagram(st1,st2);
		if(rs)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
