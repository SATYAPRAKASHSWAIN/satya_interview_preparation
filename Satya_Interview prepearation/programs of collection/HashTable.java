package collections;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<>();
		h.put(1, "Rocky");
		h.put(11, "Tusar");
		h.put(12, "Snagram");
		h.put(56, "Rose");
		System.out.println(h);
	}

}
