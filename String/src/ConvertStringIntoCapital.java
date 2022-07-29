import java.util.Scanner;

public class ConvertStringIntoCapital {
	static String convertStringIntoCapital(String str) 
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char) (ch[i]-32);
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=convertStringIntoCapital(str);
		System.out.println("Convert String into Capital: "+str);
	}	
}
