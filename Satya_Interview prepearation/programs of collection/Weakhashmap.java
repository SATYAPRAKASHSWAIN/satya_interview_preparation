package collections;

import java.util.HashMap;

public class Weakhashmap {
	
	public static void main(String[] args)  {
		int t=1;
		HashMap m=new HashMap();
		m.put(t,"Str");
		System.out.println(m);
		t=(Integer) null;
		System.out.println(m);
	}

}
