import java.util.Scanner;

public class MainStr1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();	
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Numbers of Vowels: "+vc);
		System.out.println("Numbers of Consonants: "+cc);
		System.out.println("Numbers of Capital letters: "+uc);
		System.out.println("Numbers of Small letters: "+lc);
		System.out.println("Numbers of Digits: "+dc);
		System.out.println("Numbers of Special character: "+spc);
	}
}
