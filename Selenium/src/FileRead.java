
import java.io.*;
public class FileRead {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		File file = new File ("E:\\Examples\\Hello1.txt");
		System.out.println("abs path:"+file.getAbsolutePath());
		if (file.createNewFile()){
		System.out.println("File created successfully");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("This is an example");
		writer.close();
		
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		
		fr.read(a);//reads the content to the array
		for (char c: a)
			System.out.println(c);
		
		fr.close();
		}		
	}


