package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Entryset {
	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap<>();
		hm.put(1, "Rocky");
		hm.put(2, "Sangram");
		hm.put(3,"Tusar");
		System.out.println(hm);
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		Collection<String> values=hm.values();
		System.out.println(values);
		Set m=hm.entrySet();//To get the all entries present in the HashMap object
		Iterator itr=m.iterator();//It will itrate over the entryset
		while(itr.hasNext()) {//iterator hasNext method till entries present or not
			Map.Entry<Integer, String> m1=(Entry<Integer, String>)itr.next();//creates an entry object to access keys and values 
			System.out.println(m1.getKey()+"="+m1.getValue());//Printing the values present in Entryset
			if (m1.getKey().equals(1)) {
				m1.setValue("Ram");
				System.out.println(m1);
			}
		}
		System.out.println(hm);
	}
}
