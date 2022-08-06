package com.excercise;

public class Abcd {

	public static void main(String[] args) {
		String s = "Entermaintment";
		String output = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			output = output + c;
			if (c == 't') {
				count++;
				output = output.replaceFirst(String.valueOf(c), String.valueOf(count));

			}

		}System.out.println(output);
	}
}
