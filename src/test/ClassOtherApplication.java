package test;

import origin.ClassToAccess;

public class ClassOtherApplication {
	
	private ClassToAccess testOtherApplication;
	
	public void inClassAccess () {
		
		testOtherApplication = new ClassToAccess();
		
		//System.out.println("Private : " + testOtherApplication.test1);
		System.out.println("Private : impossible");
		// System.out.println("Protected : " + testOtherApplication.test2);
		System.out.println("Protected : impossible");
		System.out.println("Public : " + testOtherApplication.test3);
		// System.out.println("Rien : " + testOtherApplication.test4);
		System.out.println("Rien : impossible");
		// System.out.println("Static : " + testOtherApplication.test5);
		System.out.println("Static : impossible");
	}
}
