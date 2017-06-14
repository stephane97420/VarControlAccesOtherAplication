package test;

public class Main {

	public static void main(String[] args) {
		
		ClassOtherApplication test = new ClassOtherApplication();
		
		System.out.println("Accèss aux variables dans une classe qui est dans une autre application que la classe :");
		System.out.println();
		test.inClassAccess();
		System.out.println();

	}

}
