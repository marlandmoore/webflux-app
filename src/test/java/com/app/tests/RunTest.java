package com.app.tests;


public class RunTest {

	public static void main(String[] a) {
		RunTest test = new RunTest();
		if(test.execute()) {
			System.out.println("PASSED!");
		}
	}
	
	public boolean execute() {
		BaseTest test1 = new BaseTest();
		
		return true;
	}
}
