import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
//		String st="";
//		for (int i = str.length()-1; i >= 0; i--) 
//		{
//			char ch=str.charAt(i);
//			st=st+ch;
//		}
//		System.out.println("Reverse String:" + st);
		
		
		char ch[]=str.toCharArray();
		char st[]=new char[str.length()];
		int j=0;
		for (int i =ch.length-1; i >=0 ; i--) 
		{
			st[j]=ch[i];
			j++;
		}
		String st1=new String(st);
		System.out.println(st1);
	}

}
