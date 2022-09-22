
public class ReverseString {
	public static void main(String[] args) {
		String str="Hello World";
		String rs="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			rs=ch+rs;
		}
		System.out.println("Reverse String: "+ rs);
	}
}
