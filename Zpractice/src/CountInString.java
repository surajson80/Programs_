import java.util.Scanner;
public class CountInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println("Vowels: "+ vc);
		System.out.println("Consonants: "+ cc);
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
			}
		}
		System.out.println("Upper Case: "+ uc);
		System.out.println("Lower Case: "+ lc);
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				dc++;
			}
			else if(ch==' ')
			{
				spc++;
			}
		}
		System.out.println("Digits: "+ dc);
		System.out.println("Space Count: "+ spc);
	}
}
