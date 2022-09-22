public class Employee {
	int eid;
	String ename;
	double esal;
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "["+eid+","+ename+","+esal+"]";
	}
}
