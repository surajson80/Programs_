//*******************//
//READING THE FILE//
//******************//
import java.io.*;
public class FileRead {
	public static void main(String[] args) {
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("E:\\JSpiderNotes\\FileHandel\\Simple.txt");
			int bt=0;
			while((bt=fin.read())!=-1)
			{
				System.out.print((char)bt);
			}
			System.out.println("thank you");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present in your system");
		}
		catch(IOException e) {
			System.out.println("We cann't read this file");
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("Unable to close");
			}
		}
	}
}
