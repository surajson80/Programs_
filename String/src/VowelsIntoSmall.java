import java.util.Scanner;

public class VowelsIntoSmall {
	static String convertVowelsIntoLower(String st) 
	{
		String v="aeiouAEIOU";
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(v.indexOf(ch[i])>=0)
			{
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char) (ch[i]+32);
			}
			else
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char) (ch[i]-32);
			}
		}	
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=convertVowelsIntoLower(str);
		System.out.println("Convert Vowels into Lower: "+str);
	}
}
