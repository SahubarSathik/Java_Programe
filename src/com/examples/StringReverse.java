package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	private void usingSStringBuffer() {

		String name = "Sahubar";

		StringBuffer reverse = new StringBuffer();
		reverse.append(name);
		System.out.println(reverse.reverse() + "\n");
	}

	private void usingcharArray() {

		String name1 = "Sathik";
		char[] charArray = name1.toCharArray();
		String reversed = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + charArray[i];

		}
		System.out.println(reversed);
	}

	private void usingCollections() {
		String given = "Benazir";
		char[] array = given.toCharArray();
		List<Character> list = new ArrayList<Character>();

		for (Character character : array) {
			list.add(character);
		}
		Collections.reverse(list);

		ListIterator<Character> Iterator = list.listIterator();
		while (Iterator.hasNext()) {

			System.out.println(Iterator.next());

		}

	}

	public static void main(String[] args) {
		StringReverse ex = new StringReverse();
		ex.usingSStringBuffer();
		ex.usingcharArray();
		ex.usingCollections();
		
		String s = "sahubar";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1; i>=0; i--){
		rev=rev+ch[i];

		}
		System.out.println(rev);
		
		/*String s ="Hinduja";
		StringBuffer s1 = new StringBuffer();
		s1.append(s);
		s1.reverse();
		System.out.println(s1);
		
		char[] charArray = s.toCharArray();
		String reversed="";
		
		for (int i = charArray.length-1; i>=0; i--) {
			reversed=reversed+charArray[i];
			
		}
		System.out.println(reversed);
		
		
		List<Character> list = new ArrayList<Character>();
		
		
		for (Character charArray1 : charArray) {
			list.add(charArray1);
		}
		Collections.reverse(list);
		
		Iterator<Character> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}*/
		
		
		
	}

}
