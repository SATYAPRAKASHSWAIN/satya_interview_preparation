package collections;

import java.util.Stack;

public class Stack1 {
	int a=10;
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.add("Tusar");//offset 4
		s.add("Sangram");//offset 3
		s.add("Marc");//offset 2
		s.add("Starc");//offset 1
		System.out.println(s);
		System.out.println(s.search("Tusar"));//Return 4
		System.out.println(s.search("Mom"));//Return -1
		System.out.println(s.peek());//Return Starc from the top here the top is Starc and bottom is Tusar
		s.pop();//Will remove the object from the top of the stack
		System.out.println(s);//[Tusar, Sangram, Marc]
		
	}

}
