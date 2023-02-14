package collections;

import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
		TreeSet <Object> t=new TreeSet<>();
//		t.add(10);
//		t.add(12);
//		t.add(9);
		//t.add("Tusar");//It will throw classcast exception because heterogeneous objects are not allowed
		//System.out.println(t);//[9, 10, 12]
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("C"));
		System.out.println(t);//Class cast exception
	}

}
