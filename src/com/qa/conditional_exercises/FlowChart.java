package com.qa.conditional_exercises;

public class FlowChart {

	public static int some_method(int n1, int n2, boolean pass) {

		if (pass) {
			return n1 + n2;
		} else
			return n1 * n2;
	}
	
	public static void main(String[] args) {
		System.out.println(some_method(1,2,true)); //Input (1, 2, true) -> 3
		
		//output: 3
	}
}