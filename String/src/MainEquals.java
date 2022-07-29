
public class MainEquals{
	public static void main(String[] args) {
		System.out.println("Literals------------");
		String s1="java";
		String s2="python";
		String s3="java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println(" ");
		System.out.println("Constructor-----------");

		String st1=new String("java");
		String st2=new String("python");
		String st3=new String("java");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		
		System.out.println(" ");
		System.out.println("equals methods---------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println("-----------------------");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));

	}

}
