
public class MainStringMethods {
	public static void main(String[] args) {
		String str="Jspiders";
		int in=str.indexOf('p');
		System.out.println(in);
		
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',2));
		System.out.println(str.indexOf("spider"));
		
		char ch[]=str.toCharArray();////converting from String to array
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.println(i+"->"+ch[i]);
		}
	}

}
