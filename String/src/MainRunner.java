
public class MainRunner {
	public static void main(String[] args) {
		Employee e1=new Employee(123, "Ramesh", 25000.56);
		Employee e2=new Employee(124, "Suresh", 28000.96);
		Employee e3=new Employee(125, "Rakesh", 25000.56);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));

	}
}
