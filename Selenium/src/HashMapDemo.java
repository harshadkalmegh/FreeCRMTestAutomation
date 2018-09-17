
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a hash map
		HashMap hm =new HashMap();//inbuilt class
		
		//put element to the map
		hm.put("Amit",new Double (3434.34));
		hm.put("Sachin",new Double (123.34));
		hm.put("Zubair",new Double (1378.34));
		hm.put("Senthil",new Double (99.22));
		hm.put("Riyaz",new Double (-19.08));
		hm.put("Riyaz",new Double (-1449.08));
		//Get a set of the entries
		Set set=hm.entrySet();
		System.out.println(hm);
		System.out.println(hm.entrySet());
		
		//Get an iterator
		Iterator i =set.iterator();
		//Display elements
		while(i.hasNext()){
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
			
		}
hm.put("Senthil",new Double (-19.08));

System.out.println(hm.entrySet());
System.out.println(hm.get("Senthil"));
System.out.println("SachinT new balance:" +hm.get("SachinT"));
	}

}
