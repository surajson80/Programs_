//***************************//
//Count no. of lines of text//
//Count no. of lines of code//
//***************************//
import java.io.*;
public class NoOfLinesIntoFile {
	public static void main(String[] args) {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("E:\\JSpiderNotes\\FileHandel\\Simple.txt");
			int count=0,bt=0;
			while((bt=fin.read())!=-1) {
				if(bt=='\n')
					count++;
			}
			System.out.println("Number of lines: "+count);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
