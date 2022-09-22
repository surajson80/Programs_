//***************************IMP********************************//
//***************************IMP********************************//
//***************************IMP********************************//
import java.io.*;
public class DisplaySourceCodeAsOutput {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("C:\\Users\\MONSTER ROMAN\\Desktop\\NEW FOLDER\\FileHandling\\src\\DisplaySourceCodeAsOutput.java");
			byte b[]=new byte[fin.available()];
			fin.read(b);
			String s1=new String(b);
			System.err.println(s1);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
