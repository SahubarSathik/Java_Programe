package org.Learning;

import io.netty.util.internal.SystemPropertyUtil;

public class Starting {

	// Check odd or even number
	private void program1() {
		System.out.println("Check odd or even number");
		int a = 12;

		if (a % 2 == 0) {
			System.out.println(a + " is Even Number" + "\n");
		} else {
			System.out.println(a + "is Add Number" + "\n");
		}
		System.out.println("-----------------------------------");
	}

	// Print add Number from 1 to 10
	private void program2() {
		System.out.println("Print add Number from 1 to 10");
		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		System.out.println("-----------------------------------");
	}

	// Print Even Number from 1 to 10
	private void program3() {
		System.out.println("Print Even Number from 1 to 10");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------------------------");

	}

	// Count Add Number from 1 to 100
	private void prorame4() {
		System.out.println("Count Add Number from 1 to 100");
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {

				count++;

			}
		}
		System.out.println(count + "\n" + "---------------------------------");
	}

	private void programe5() {
		System.out.println("Count Even Number from 1 to 100");

		int count = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count+"\n"+"----------------------------------");
	}
//Print Sum Even Number from 1 to 90
	private void programe6() {
		System.out.println("Add Even Number from 1 to 90");
		int sum=0;
		for (int i = 1; i <= 90; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum+"\n"+"----------------------------------");
	}
//Print Sum of Add Number from 1 to 90
	private void programe7() {
		System.out.println("Print Sum of Add Number from 1 to 90");
		int sum=0;
		for(int i=1; i<=90; i++) {
			if(i%2!=0) {
				sum+=i;
			}
			
		}
			System.out.println(sum);
		
		
	}
	public static void main(String[] args) {

		Starting st = new Starting();
		st.program1();
		st.program2();
		st.program3();
		st.prorame4();
		st.programe5();
		st.programe6();
		st.programe7();
	}
}
