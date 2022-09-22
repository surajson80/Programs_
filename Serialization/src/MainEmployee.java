///////////////////////////////////////////
//////////Serialization////////////////////
///////////////////////////////////////////
import java.io.*;
import java.util.Scanner;
public class MainEmployee {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id name and salary");
		int id=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		Employee emp=new Employee(id, name, sal);
		FileOutputStream fout=new FileOutputStream("E:\\JSpiderNotes\\FileHandel\\Employee.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp);
		System.out.println("serialize the employee Object");
		out.flush();
		out.close();
		fout.flush();
		fout.close();
	}
}
