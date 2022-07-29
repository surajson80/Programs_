import java.util.Scanner;

public class MainStr3 {
	static int countVowels(String st) 
	{
		String v="aeiouAEIOU";
		int count=0;
		for (int i = 0; i < st.length(); i++) 
		{
			char ch=st.charAt(i);
			if(v.indexOf(ch)>=0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		System.out.println("Sum of Vowels:"+countVowels(str));
	}
}
