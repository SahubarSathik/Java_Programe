package com.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "kili");
		m.put(2, "man");
		m.put(3, "muyal");
		m.put(4, "karai");
		System.out.println(m);
		HashMap<Integer, String> m1 = new HashMap<>();
		m1.putAll(m);
		System.out.println(m1);
		Set<Entry<Integer, String>> entrySet = m.entrySet();

		System.out.println(entrySet);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("man"));
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		// m1.put(null, "erumai");
		// m1.put(null, "muthalai");
		System.out.println(m1);

		TreeMap<Integer, String> m2 = new TreeMap<>(m1);
		System.out.println(m2);

	}
}
