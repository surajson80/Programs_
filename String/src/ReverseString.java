import java.util.Scanner;

public class ReverseString {
	static String reverseString(String str)//suraj
	{
		char ch[]=str.toCharArray();//ch[]={'s','u','r','a','j'}
		char newch[]=new char[ch.length];
		int j=0;
		for (int i = ch.length-1; i>=0; i--) 
		{
			newch[j]=ch[i];//0-4/1-3/2-2/3-1/4-0
			j++;
		}
		return new String(newch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		str=reverseString(str);
		System.out.println("Reverse String : "+str);
	}
}
