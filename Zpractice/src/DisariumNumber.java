import java.util.Scanner;

public class DisariumNumber {
	
	static boolean checkNum(int x)//89
	{
		int p=countNum(x);//2
		int sum=0,temp=x;
		do
		{
			int d=x%10;//9
			sum=sum+pow(d,p);//9*2
			p--;       //1
			x=x/10;//8
		}while(x!=0);
		return temp==sum;
	}
	
	static int pow(int d, int p) 
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*d;
			p--;
		}
		return prod;
	}
	
	static int countNum(int x) 
	{
		int count=0;
		do
		{
			x=x/10;
			count++;
		}while(x!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean dnum=checkNum(n);
		if(dnum)
			System.out.println(n+" is Disarium Number.");
		else
			System.out.println(n+" is not Disarium Number.");
	}

}
