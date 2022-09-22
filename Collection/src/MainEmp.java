import java.util.*;
public class MainEmp 
{
	 static Employee getHighestSalary(List employees) 
	{
		 Employee he=(Employee)employees.get(0);
		for (int i = 1; i < employees.size(); i++) 
		{
			Employee em=(Employee) employees.get(i);
			if(em.esal>he.esal)
				he=em;
		} 
		 return he;
	}
	   
	 static List get5000AboveSalary(List employees)
	{
		 List ls=new ArrayList();
		 for (Object obj : ls)
		{
			Employee em=(Employee) obj;
			if(em.esal>=5000)
				ls.add(em);
		}
		 return ls;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List employees=new ArrayList();
		while(true)
		{
			System.out.println("Enter employee id, name and salary: ");
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			Employee emp=new Employee(id, name, sal);
			employees.add(emp);
			System.out.println("Do you have more employee ?");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
			{
				break;
			}
		}
		System.out.println("Employees List: ");
		Iterator itr=employees.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Employee em=getHighestSalary(employees);
		System.out.println("Heighest Salary: ");
		System.out.println(em);
		
		List es=get5000AboveSalary(employees);
		System.out.println("List of employees whoes salary is above 5000: ");
		for (Object obj : es)
		{
			System.out.println(obj);
		}
	}
	
}
