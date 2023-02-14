package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(2, "Tusar");//Adding key and value to the HashMap object
		m.put(1,"Rocky");
		Set<Integer> keys=m.keySet();//set object Give all the keys present in the Hashmap object
		Collection<String> values=m.values();//It will return the values present in the Hashmap.
		Set e=m.entrySet();//Will give us all the entries present in the HashMap object;
		System.out.println(keys);
		System.out.println(m.put(1, "Ram"));//Replace the value associated with key 1.
		System.out.println(m);
		System.out.println(values);
		System.out.println(e);
	}
}
