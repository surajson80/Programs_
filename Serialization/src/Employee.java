import java.io.Serializable;
public class Employee implements Serializable {
	private static final long serialVersionUID=342L;
	
	int eid;
	String  ename;
	double esal;
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
}
