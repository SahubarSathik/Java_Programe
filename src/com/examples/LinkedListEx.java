package com.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(20);
		linkedList.add(20);
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		
		
		System.out.println(linkedList);
		linkedList.addFirst(5);
		System.out.println(linkedList);
		linkedList.addLast(65);
		System.out.println(linkedList);
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		System.out.println(linkedList.get(5));
		
		linkedList.poll();
		System.out.println(linkedList);
		linkedList.pollFirst();
		System.out.println(linkedList);
		linkedList.pollLast();
		System.out.println(linkedList);
		linkedList.removeFirstOccurrence(20);
		System.out.println(linkedList);
		linkedList.removeLastOccurrence(20);
		System.out.println(linkedList);
		
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("");
		for (Integer integer : linkedList) {
			System.out.println(integer);
		}
		System.out.println("");
		Iterator<Integer> integer=linkedList.iterator();
		while (integer.hasNext()) {
		System.out.println(integer.next());
			
		}
				
		
		
		
	}
}
