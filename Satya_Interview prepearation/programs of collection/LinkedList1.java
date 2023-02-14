package collections;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Object> tusar=new LinkedList<Object>();
		tusar.add(1);//adding integer to  linkedlist object
		tusar.add("Tusar");//adding String to  linkedlist object
		tusar.add(null);//adding null to  linkedlist object
		tusar.add('p');//adding character to  linkedlist object
		System.out.println(tusar);//[1, Tusar, null, p]
		tusar.set(2, 10);//Set the value present in index 2 to 10 
		System.out.println(tusar);//new list is [1, Tusar, 10, p]
		tusar.addFirst('R');//inserted character R in the 1st place of the linkedlist
		System.out.println(tusar);//[R, 1, Tusar, 10, p]
		tusar.removeLast();//Last object present in the linked list deleted
		System.out.println(tusar);//[R, 1, Tusar, 10]
	}

}
