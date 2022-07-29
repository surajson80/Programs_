import java.util.Scanner;

public class MainStr4 {
	static String convertIntoLower(String st)
	{
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char) (ch[i]+32);
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=convertIntoLower(str);
		System.out.println("Convert into Lower: "+str);
	}
}
