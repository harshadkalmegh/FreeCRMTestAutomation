import java.util.ArrayList;

public class ArrayListExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a =new ArrayList<String>();
		
		a.add("Harshad");
		a.add("Rahul");
		System.out.println(a);
		a.add(0, "Sagar");
		System.out.println(a);
		a.add(1, "Surbhi");
		System.out.println(a);
		System.out.println(a.size());
		//a.remove(1);
		System.out.println(a);
		System.out.println(a.indexOf("Harshad"));
		System.out.println(a.get(1));
		System.out.println(a.contains("Java"));
		System.out.println(a.isEmpty());
		//a.removeAll(a);
		//System.out.println(a);
	}
}
