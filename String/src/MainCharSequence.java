
public class MainCharSequence {
	public static void main(String[] args) {
		String str="jspider";
		for (int i = 0; i < str.length(); i++) 
		{
			System.out.println(i+"->"+str.charAt(i));
		}
		System.out.println(str.subSequence(1, 7));
	}

}
