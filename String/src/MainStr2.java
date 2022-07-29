import java.util.Scanner;

public class MainStr2 {
	 static int sumOfDigits(String st) 
	 {
		 char ch[]=st.toCharArray();
		 int sum=0;
		 for (int i = 0; i < ch.length; i++) 
		 {
			 if(ch[i]>='0'&&ch[i]<='9')
				 sum=sum+(ch[i]-48);
		 }
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		System.out.println("Sum of digits:"+sumOfDigits(str));
	}

}
