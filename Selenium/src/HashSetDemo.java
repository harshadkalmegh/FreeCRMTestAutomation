import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		//create a hash set
		
		HashSet hs= new HashSet();
		//add element to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F");
		hs.remove("D");
		hs.clone();
		HashSet hs1=(HashSet) hs.clone();
		System.out.println(hs);	
		System.out.println(hs1);
		Iterator it = hs.iterator();
		while(it.hasNext()){	
			System.out.println(it.next());
			
		}
	}
}
