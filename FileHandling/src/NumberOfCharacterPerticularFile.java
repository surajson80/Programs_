import java.io.File;
public class NumberOfCharacterPerticularFile {
	public static void main(String[] args) {
		File fil=new File("C:\\Users\\MONSTER ROMAN\\Desktop\\java-4.30-1\\Arrays\\src");
		File fls[]=fil.listFiles();
		for (File f : fls)
		{
			if(f.getName().endsWith(".java"))
			{
				System.out.println(f.getName()+" = size: "+f.length());
			}
		}
	}
}
