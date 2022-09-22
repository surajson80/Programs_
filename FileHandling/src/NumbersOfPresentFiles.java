import java.io.*;
public class NumbersOfPresentFiles {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\MONSTER ROMAN\\Desktop\\java-4.30-1");
		System.err.println(f1.getAbsolutePath());
		System.err.println(f1.getParent());
		String fnames[]=f1.list();
		for (String nm : fnames)
		{
			System.out.println(nm);
		}
		System.err.println("java.files");
		for (String nm : fnames)
		{
			if(nm.endsWith(".java"));
			System.out.println(nm);
		}
	}
}
