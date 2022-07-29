
public class MainImmutable {
	public static void main(String[] args) {
		String str1="Ramesh";
		str1.replace('m', 'j');
		System.out.println(str1);
		
		String str2="Rakesh";
		str2=str2.replace('k', 'j');
		System.out.println(str2);
		
		String s1="jspider";
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
	}

}
