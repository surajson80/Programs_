import java.util.Scanner;

public class MainStr6ReverseString {
	static String reverse(String str) //suraj
	{
		String rev="";
		for (int i = 0; i < str.length(); i++)
		{
			//char ch=str.charAt(i);
			rev=str.charAt(i)+rev;//jarus
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=reverse(str);
		System.out.println("Reverse String: "+str);
	}
}
