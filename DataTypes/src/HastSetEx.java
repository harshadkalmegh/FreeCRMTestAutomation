import java.util.HashSet;
import java.util.Iterator;



public class HastSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> hs=new HashSet<String>();

		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("india");
		hs.add("India");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.size());
		System.out.println(hs.contains("India"));
		
		Iterator <String> i=hs.iterator();
		//Iterator<String> i=hs.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
	}

}
