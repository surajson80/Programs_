import java.util.Scanner;

public class MainStr5 {
	static String vowelsSmall(String st)
	{
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a'&&ch[i]<='z')
				{
					if((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')==false)
						ch[i]=(char)(ch[i]-32);
				}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=vowelsSmall(str);
		System.out.println("Convert Vowels into Lower: "+str);
	}

}
