package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		System.out.println(al);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer) itr.next();//it will give the vale one by one
			System.out.println(i);//0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			if(i%2==0) {
			System.out.println(i);//0,2,4,6,8
			}else {
				itr.remove();//it will remove the value.
			}
		}
		
		System.out.println(al);
	}

}
