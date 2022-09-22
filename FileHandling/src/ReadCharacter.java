import java.io.*;
public class ReadCharacter {
	public static void main(String[] args) {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("E:\\JSpiderNotes\\FileHandel\\Simple.txt");
			byte b[]=new byte[fin.available()];
			fin.read(b);
			String s1=new String(b);
			System.out.println(s1);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
