package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListeEx {

	public static void main(String[] args) {
		List<String> arrayList= new ArrayList<String>();
		
		arrayList.add("Hundai");
		arrayList.add("venue");
		arrayList.add("zuzuki");
		arrayList.add("maruthi");
		arrayList.add("bugatti");
		arrayList.add("bolero");
		arrayList.add("Hundai");
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("bugatti"));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.indexOf("zuzuki"));
		System.out.println(arrayList.lastIndexOf("Hundai"));
		System.out.println(arrayList.remove("bugatti"));
		System.out.println(arrayList);
		
		ArrayList<String> newList = new ArrayList<String>();
		
		newList.addAll(arrayList);
		System.out.println(newList);
		
		newList.clear();
		System.out.println(newList);
		arrayList.set(1, "Lambogrini");
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("");
		
		ListIterator<String> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
			
		}
		System.out.println("");
	
		while (iterator.hasPrevious()) {
		System.out.println(iterator.previous());
			
		}
		System.out.println("");
		Iterator<String> iterator1=arrayList.iterator();
		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
			
		}

		
		
		
		
		
	}
	
	
}
