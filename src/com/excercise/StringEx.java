package com.excercise;

import java.util.Scanner;

public class StringEx {

	private void length() {
		String a = "GreensTechnology";
		String b = "SeleniumAutomationtool";
		String c = "velmurugan";
		String d = "j a v a p r o g r a m";
		String e = "9095484678";

		System.out.println(
				a.length() + "\n" + b.length() + "\n" + c.length() + "\n" + d.length() + "\n" + e.length() + "\n");
		System.out.println(a.lastIndexOf("o") + "\n" + b.indexOf("o") + "\n" + c.indexOf("n") + "\n" + d.indexOf(" ")
				+ "\n" + e.indexOf("8") + "\n");
		System.out.println(a.indexOf("h") + "\n" + b.indexOf("o") + "\n" + c.indexOf("u") + "\n" + d.indexOf("p") + "\n"
				+ e.indexOf("7"));
		System.out.println(
				a.charAt(9) + "\n" + b.charAt(11) + "\n" + c.charAt(4) + "\n" + d.charAt(8) + "\n" + e.charAt(8));
	}

	private void userInput() {
		s = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("enter the Two String Values");
			String string1 = s.nextLine();
			String string2 = s.nextLine();

			if (string1.equals(string2)) {
				System.out.println(" Two String is Equal");
			} else {
				System.out.println(" Two String is Not-Equal");
			}

		}
		for (int i = 0; i < 2; i++) {
			System.out.println("enter the Two String Values");
			String string1 = s.nextLine();
			String string2 = s.nextLine();

			if (string1.equalsIgnoreCase(string2)) {
				System.out.println(" Two String is Equal");
			} else {
				System.out.println(" Two String is Not-Equal");
			}

		}
	}

	Scanner s;

	private void verifyEmailId() {
		s = new Scanner(System.in);
		System.out.println("Enter Email Id");
		String emailId = s.next();
		if (emailId.contains("@")) {
			System.out.println("Valid emailId");
		} else {
			System.out.println("Invalid emailId");
		}

	}

	private void verifyPincode() {
		s = new Scanner(System.in);
		System.out.println("Enter Email Id");
		String emailId = s.nextLine();
		if (emailId.contains("pincode")) {
			System.out.println("Valid Addres ");
		} else {
			System.out.println("Invalid Addres");
		}

	}

	private void lengthCheck() {
		s = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mobileNo = s.next();
		if (mobileNo.length() <= 10) {
			System.out.println(mobileNo);
		} else {
			System.out.println("invalid mobiile number");
		}

	}

	private void characterCheck() {
		s = new Scanner(System.in);

		try {
			System.out.println("Enter mobile number");
			long mobileNo = s.nextLong();
			System.out.println("Valid Number");
		} catch (Exception e) {
			System.out.println("Invalid Number");
		}

	}

	private void replace() {
		String s = "Welcome to class java";
		System.out.println(s.replace("java", "sql"));
		String s1 = "Greens Adyar";
		System.out.println(s1.replace("Adyar", "greens omr"));
		String s2 = "Welcome to java class";
		System.out.println(s2.replace(" ", "#"));
	}

	private void verifyReplace() {
		s = new Scanner(System.in);
		System.out.println("Enter Email Id");
		String emailId = s.next();
		if (emailId.contains("gmail")) {

			System.out.println(emailId.replace("gmail", "yahoo"));
		} else {
			System.out.println("Invalid emailId");
		}

	}

	private void verifyReplace1() {
		s = new Scanner(System.in);
		System.out.println("Enter your name1");
		String name = s.nextLine();
		System.out.println("Enter your name2");
		String name1 = s.nextLine();

		System.out.println(name.compareTo(name1));

		System.out.println(name.toLowerCase());
		String paragraph = "WelCome To Java";
		System.out.println(paragraph.endsWith("WelCome"));
		System.out.println(paragraph.isEmpty());
	}

	private void literalString() {
		String s = "Sahubar";
		String s1 = "Sahubar";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}
	private void nonLiteralString() {
		StringBuffer s= new StringBuffer("Kumar");
		System.out.println(s.hashCode());
		
		StringBuffer s1= new StringBuffer("Kumar");		
		System.out.println(s1.hashCode());

		StringBuffer s2= new StringBuffer("Santhose");		
		System.out.println(s2.hashCode());

	}
	private void split() {
		String s = "Welcome to Java Class";
		String[] split = s.split(" ");
		
		System.out.println(s.substring(0,7));
		
		for (String x : split) {
			System.out.println(x);
		}
	
	}

	public static void main(String[] args) {
		StringEx ex = new StringEx();
		// ex.length();
		// ex.userInput();
		// ex.verifyEmailId();
		// ex.verifyPincode();
		// ex.lengthCheck();
		// ex.characterCheck();
		// ex.replace();
		// ex.verifyReplace();
		// ex.verifyReplace1();
		//ex.literalString();
		//ex.nonLiteralString();
		ex.split();

	
}
}
