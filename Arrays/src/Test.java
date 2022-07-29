
public class Test {
	static void sh()
	{
		System.out.println("A");
	}
	public static void main(String[] args) {
		Test obj=new Test();
		System.out.println(obj);
		obj=null;
		System.out.println(obj);
		obj.sh();
	}

}
