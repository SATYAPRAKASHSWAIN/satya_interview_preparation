package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {
	
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<>();
		ll.add("Tusar");
		ll.add("Rocky");
		ll.add("Lal");
		ll.add("Master");
		//System.out.println(ll);
		ListIterator<String> l1=ll.listIterator();
		while(l1.hasNext()) {
			String s=(String) l1.next();
			if(s.equals("Tusar")) {
				l1.remove();
				//System.out.println(ll);
			}
			else if(s.equals("Lal")) {
				l1.add("Tusar");
				System.out.println(ll);
			}
		}
	}

}
