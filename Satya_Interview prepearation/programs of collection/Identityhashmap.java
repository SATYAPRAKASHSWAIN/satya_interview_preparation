package collections;

import java.util.IdentityHashMap;

public class Identityhashmap {
	
	public static void main(String[] args) {
		IdentityHashMap<Integer, String> m=new IdentityHashMap<Integer, String>();
		Integer I=new Integer(10);
		Integer I1=new Integer(10);
		m.put(I, "Ram");
		m.put(I1,"Laxman");
		System.out.println(m);
	}

}
