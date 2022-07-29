
public class Employee {
	int eid;
	String ename;
	double esal;
	public Employee(int eid,String ename,double esal) 
	{
		super();
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	@Override
	public String toString() 
	{
		return "["+eid+","+ename+","+esal+"]";
	}
	@Override
	public int hashCode() 
	{
		return eid;
	}
	@Override
	public boolean equals(Object obj) 
	{
		Employee e=(Employee)obj;
		return this.esal==e.esal;
	}

}
