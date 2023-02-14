package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		ArrayList <Integer> l=new ArrayList <Integer>();
		l.add(25);//adding values to arraylist
		l.add(20);//adding values to arraylist
		l.add(25);//adding values to arraylist
		l.add(22);//adding values to arraylist
		l.add(21);//adding values to arraylist
		System.out.println(l);//[25, 20, 25, 22, 21]
		ArrayList <Integer> l1=new ArrayList<Integer>();
		l1.add(30);
		l1.add(35);
		l1.add(32);
		l1.add(33);
		l1.add(35);
		System.out.println(l1);//[30, 35, 32, 33, 35]
		l.addAll(l1);//Added the array list l1 into l
		System.out.println(l);//[25, 20, 25, 22, 21, 30, 35, 32, 33, 35]
		System.out.println(l.get(3));//Finding the value present in index 3 from Array list object
		System.out.println(l.remove(1));//20 is removed from index 1.
		
		ArrayList <Integer> l2=new ArrayList<Integer>();//Non Synchronized version
		l2.add(10);
		l2.add(11);
		List<Integer> list=Collections.synchronizedList(l2);//Synchronized version
		System.out.println(list);
	}

}
