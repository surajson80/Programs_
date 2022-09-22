import java.util.Scanner;
public class ReplaceStringPart 
{
	 static void checkString(String str) 
	{
		 String str1=str.toLowerCase();
		 if(!str.equals(str1))
		 {
			 System.out.println("Invalid");
		 }
		 else
		 {
			 String front=str.substring(0, 3); //surajsure
			 System.out.println(front);
			 String mid=str.substring(front.length(),6);
			 System.out.println(mid);
			 String last=str.substring(mid.length()+3, str.length()); // 0123456789
			 System.out.println(last);
			 String st="";
			 for (int i = 0; i < front.length(); i++) 
			 {
				 st=st+(i+1);
			 }
			 for (int i = 0; i < last.length(); i++) 
			 {
				 String temp="";
				 st=st+(mid.charAt(i)+temp);
			 }
			 System.out.println(st);
		 }
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 9th character String: ");
		String str=sc.nextLine();
		checkString(str);
	}
}
