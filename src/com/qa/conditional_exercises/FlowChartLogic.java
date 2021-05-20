package com.qa.conditional_exercises;


public class FlowChartLogic {
	public static void main(String[] args) {
		inputA(55);//Can be any number here!
	}
	

	public static void inputA(int a) {
		System.out.println("Enter a number: ");
		if (a > 2000) {
			System.out.println("A");

			if (a > 6000) {
				System.out.println("C");
				System.out.println("End");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
					System.out.println("End");
				} else {
					System.out.println("E");
					System.out.println("End");
				}
			}
		} else {
			System.out.println("1");
		}
		if (a > 100) {
			System.out.println("3");
			if (a > 600) {
				System.out.println("5");
				System.out.println("End");
			} else {
				System.out.println("4");
				if (a > 500) {
					System.out.println("6");
					System.out.println("End");
				} else {
					System.out.println("7");
					System.out.println("End");
				}
			}

		} else {
			System.out.println("2");
			System.out.println("End");
		}
	}

}
