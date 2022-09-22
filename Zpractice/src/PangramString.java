import java.util.Scanner;
public class PangramString 
{
	private static boolean checkPangram(String str) 
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
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
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
