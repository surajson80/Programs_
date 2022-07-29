import java.util.Scanner;

public class XylemPhloemNumber {
	static boolean checkNum(int x) //123
	{
		int mdSum=0,edSum;
		int ed=x%10;//3
		x=x/10;
		while(x>9)
		{
			int d=x%10;
			mdSum=mdSum+d;
			x=x/10;
		}
		
		edSum=ed+x;
		return edSum==mdSum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		boolean getNum=checkNum(n);
		if(getNum)
			System.out.println(n+" is Xylem Number.");
		else
			System.out.println(n+" is Phloem Number.");
	}
}
