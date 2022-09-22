import java.util.Scanner;
public class SwapFirstAndLastChar 
{
	private static String swapLastFistChar(String str) 
	{
		char ch[]=str.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}	
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String st=swapLastFistChar(str);
		System.out.println(st);
	}

	
}
