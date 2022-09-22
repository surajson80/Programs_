import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='0'&&ch[i]<='9')
				count++;
		}
		System.out.println("No. of Digits:"+count);
	}

}
