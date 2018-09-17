import java.util.*;
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an array list
		
		ArrayList al = new ArrayList();
		
		System.out.println("Initial size of al:"+al.size());
		
		//add element to the array list
		al.add("C");
		al.add("F");
		al.add("A");
		
		al.add("B");
		al.add("D");
		al.add("C");
		al.add("F");
		al.add("E");
		
	ArrayList al1=(ArrayList) al.clone();
		System.out.println("Contents of al:"+al);
	System.out.println("Contents of al:"+al1);
		System.out.println("Size of al after additions:"+al.size());
	//Remove elements from the array list
		al.remove("C");
		al.remove(2);
	System.out.println("Size of al after deletions:"+al.size());
	System.out.println("Contents of al:"+al);
	
	ListIterator it=al.listIterator();
	//System.out.println("-----:"+it.next());
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	}

}
