///////////////////////////////////////////
///////De-Serialization////////////////////
///////////////////////////////////////////
import java.io.*;
public class MainRunnerEmployee {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("E:\\JSpiderNotes\\FileHandel\\Employee.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Employee emp=(Employee)in.readObject();
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.esal);
	}
}
