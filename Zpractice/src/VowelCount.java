import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		String st="aeiouAEIOU";
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(st.indexOf(ch)>=0)
			{
				count++;
			}
		}
		System.out.println("Vowels:"+count);
	}

}
