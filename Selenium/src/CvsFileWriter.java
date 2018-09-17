import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class CvsFileWriter {

	//Delimiter used in CVS file
	private static final String COMMA_DELIMITER=",";
	private static final String NEW_LINE_SEPARATOR="/n";
	
	//CVS file header
	private static final String FILE_HEADER="id,firstname,lastname,gender,age";
	
	public static void writeCvsFile(String fileName) {

		//Create new studentsobj objects
		Student student1= new Student(1,"Amit","Kumar","M",25);
		Student student2= new Student(2,"Smita","Kumar","F",23);
		Student student3= new Student(1,"Ashish","Sharma","M",24);
		Student student4= new Student(1,"John","Taylor","M",20);
		
		//create a new list of student objects
		
		List<Student> studentsObj = new ArrayList<Student>();
		studentsObj.add(student1);
		studentsObj.add(student2);
		studentsObj.add(student3);
		studentsObj.add(student4);
		
		FileWriter fileWriter = null;
		
		try{
			File f1 = new File("E://s1.cvs");
			fileWriter =new FileWriter(fileName);
			
			//Writer the cvs file header
			fileWriter.append(FILE_HEADER.toString());
			
			//add a new line separator after the header
			
			fileWriter.append(NEW_LINE_SEPARATOR);
			String s1 =null;
			ListIterator it= studentsObj.listIterator();
			while(it.hasNext()){
				//s1=it.next();
				System.out.println(it.next());
			}
			
			//Write a new student object list to cvs file
			for(Student student :studentsObj){
				fileWriter.append(String.valueOf(student.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getFirstName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getGender());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(student.getAge()));
				fileWriter.append(NEW_LINE_SEPARATOR);
				}
			System.out.println("CSV file was created successfully!!!");
		}catch(Exception e){
			System.out.println("Error in CsvFileWriter!!");
			e.printStackTrace();
			}
		finally{
			
			try{
				fileWriter.flush();
				fileWriter.close();
			}catch (IOException e){
				System.out.println("Error while flushing/closing fileWriter!!!");
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] agrs){
		
		String fileName = "student.csv";
		
		System.out.println("Writer CSV file:");
		writeCvsFile(fileName);
		
	}
}
