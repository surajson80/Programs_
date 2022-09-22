//*****************************************************//
/////////////////////////////////////////////////////////
//***************VERY VERY IMP*************************//
/////////////////////////////////////////////////////////
//*****************************************************//
import java.io.*;
public class CopyJavaProgToOneFileToAnotherFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fin=new FileInputStream("C:\\Users\\MONSTER ROMAN\\Desktop\\NEW FOLDER\\FileHandling\\src\\DisplaySourceCodeAsOutput.java");
		FileOutputStream fout=new FileOutputStream("E:\\JSpiderNotes\\FileHandel\\SimpleCopy.pdf");
//		int bt=0;
//		while((bt=fin.read())!=-1)
//		{
//			System.out.print((char)bt);
//			fout.write(bt);
//			Thread.sleep(100);
//		}
		byte b[]=new byte[fin.available()];
		fin.read(b);
		fout.write(b);
		fin.close();
		fout.flush();
		fout.close();
		System.out.println("Successeful");
	}
}
