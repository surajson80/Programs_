
public class TraceProgram {
	public static void main(String[] args) {
//		System.out.println('A'+'B');
		String str="1264";
//		System.out.println(str.charAt(1) - '0');
		int h1 = (int)str.charAt(1) - '0';
		int h2 = (int)str.charAt(0) - '0';
		int hh = (h2 * 10 + h1 % 10);
		System.out.println(hh);
		System.out.println('9');
	}
}
