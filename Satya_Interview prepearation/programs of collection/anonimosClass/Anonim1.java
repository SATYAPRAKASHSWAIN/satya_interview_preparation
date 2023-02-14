package anonimosClass;

public class Anonim1 {
	
	public static void main(String[] args) {
		
		Functional f=new Functional() {

			@Override
			public void myanonim() {
				System.out.println("1st anonimous Class");
				
			}};
			
			f.myanonim();
		
	}

}
