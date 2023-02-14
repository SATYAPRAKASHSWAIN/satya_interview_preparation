package lamda;

public class Lamda {
	
	public static void main(String[] args) {
		
		Functional f=(a,b)->a+b;
		
		System.out.println(f.incomplete(30,50));
		
		
		Functional1 f1=(a) -> a.length();
		
		
		System.out.println(f1.incomplete("Tusar"));
	}

}
