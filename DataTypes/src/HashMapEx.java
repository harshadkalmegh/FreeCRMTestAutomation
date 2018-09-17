import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Harshad");
		hm.put(1, "Rahul");
		hm.put(2, "Mike");
		hm.put(3, "Java");
		hm.remove("Mike");
		Set sm=hm.entrySet();
		
		Iterator i=sm.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp=(Map.Entry)i.next(); 
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		//

	}

}
