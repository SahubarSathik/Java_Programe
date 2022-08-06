package com.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetEx {
	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<Integer>();

		hash.add(2);
		hash.add(6);
		hash.add(8);
		hash.add(4);
		System.out.println(hash);
		Iterator<Integer> iterator = hash.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		hash.add(null);
		hash.add(null);
		System.out.println(hash);
		boolean empty = hash.isEmpty();
		System.out.println(empty);
		hash.remove(2);
		System.out.println(hash);

		HashSet<Integer> hash1 = new HashSet<Integer>();

		hash1.addAll(hash);
		System.out.println(hash1);
		hash1.clear();
		System.out.println(hash1);

		Set<String> s = new LinkedHashSet<String>();

		s.add("santhose");
		s.add("kumar");
		s.add("vishnu");
		s.add("santhose");

		System.out.println(s);
		System.out.println(s.contains(null));
		System.out.println(s.equals("kumar"));
		s.remove("vishnu");
		System.out.println(s);
		s.add("sathik");
		s.add("sahubar");
		s.add("chithra");
		s.add("hinduja");

		Iterator<String> iterator2 = s.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		System.out.println("");
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("");

		TreeSet<String> tree = new TreeSet<String>();
		tree.addAll(s);
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.headSet("kumar"));
		System.out.println(tree.tailSet("sahubar"));
		System.out.println(tree.subSet("hunduja", "sathik"));
		System.out.println(tree.comparator());
		System.out.println(tree.higher("chithra"));
		System.out.println(tree.lower("kumar"));
		System.out.println(tree.descendingSet());
		Iterator<String> iterator3 = tree.iterator();
		while (iterator3.hasNext()) {
			String string = (String) iterator3.next();
			System.out.println(string);
		}
		System.out.println("");
	
		Iterator<String> descendingIterator = tree.descendingIterator();
		while (descendingIterator.hasNext()) {
			String string = (String) descendingIterator.next();
			System.out.println(string);

		}

	}
}
