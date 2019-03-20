import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtablePractice {

	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(1, "Protick");
		h.put(2, "Reza");
		h.put(3, "Shovon");
		h.put(4, "Munna");
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer,String>();
		
		h1 =(Hashtable<Integer, String>) h.clone();
		
		Set<Map.Entry<Integer, String>> set = h1.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		

	}

}
