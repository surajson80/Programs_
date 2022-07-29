import java.util.Scanner;
public class ReversaeSentence {
	private static String reverseSentence(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i =ch.length-1 ; i >=0 ; i--)
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				str=str+ch[j];
				j++;
			}
			if(i>=0)
				str=str+ch[i];
		}
	return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String st=reverseSentence(str);
		System.out.println("Reverse sentence is: ");
		System.out.println(st);	
	}
}
