import java.util.Scanner;

public class StringIntoLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		System.out.println(str.toLowerCase());
		
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		String st=new String(ch);
		System.out.println(st);
	}
}
