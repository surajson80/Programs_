//******************//
//****To write******//
//******************//
import java.io.*;
public class ToWriteIntoFile {
	public static void main(String[] args) throws IOException {
			String st="java is easy if you practice";
			FileOutputStream fout=new FileOutputStream("E:\\JSpiderNotes\\FileHandel\\Simple.txt");
//			for (int i = 0; i < st.length(); i++)
//			{
//				fout.write(st.charAt(i));
//			}
			byte bt[]=st.getBytes();
			fout.write(bt);
			fout.flush();
			fout.close();
			System.out.println("successfully written");
	}
}