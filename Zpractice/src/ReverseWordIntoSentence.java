import java.util.Scanner;

public class ReverseWordIntoSentence 
{
	private static String reverseWord(String str) 
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				str=str+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				str=str+ch[i];
			}
		}	
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String st=reverseWord(str);
		System.out.println("Reverse Words in String: ");
		System.out.println(st);
	}
}
