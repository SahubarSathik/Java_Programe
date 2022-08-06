package com.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOut {

	private void reverseString() {
		String s = "Sahubar";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse() + "\n");
	}

	private void gitCommands() {

		// To pull the code form repository
		// git config --global user.email emailid
		// git config --global user.name username
		// git init

		// git status
		// git add filename
		// git commit -m "message"
		// git remote add origin repourl
		// git push -u origin master
		// * ----------------------------
		// To push the code form local to remote
		// git config --global user.email mailid
		// git config --global user.name username
		// git init
		// git status
		// git clone repourl
		// git checkout branchname
		// git add filename
		// git commit -m "message"
		// git push -u origin branchname
		// * ---------------------------------------
		// To resolve conflict
		// Cut the code from tail and paste above the head is called cherry picking
	}

	private void reverseEachWord() {
		String input = "This is Stupid Word";
		String output = "";

		String[] words = input.split(" ");
		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revword = revword + word.charAt(i);
			}
			output = output + revword + " ";
		}
		System.out.println(output);
		// Window Handles
		WebDriver driver = new ChromeDriver();
		driver.get("");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String parentId = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (int i = 0; i < allWindows.size(); i++) {
			link.get(i).click();
			String string = allWindows.toString();
			if (parentId != string) {

				driver.switchTo().window(string);
				driver.close();
				driver.switchTo().defaultContent();

			}
		}
	}

	private void reverseString2() {
		String s = "hello";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	private void printVowelsCount() {
		String s = "My Name is Sathik";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c

			== 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				count++;
			}
		}
		System.out.println(count + "\n");
	}

	private void printNumberOfLetters() {
		String s = "My Name is Sahubar";
		char[] ch = s.toCharArray();
		int length = ch.length;
		System.out.println(length + "\n");
	}

	private void removeArrayDuplicates() {

		int[] ar = new int[8];
		ar[0] = 10;
		ar[1] = 20;
		ar[3] = 30;
		ar[4] = 40;
		ar[5] = 10;
		ar[6] = 20;
		ar[7] = 30;

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		for (Integer arr : set) {
			System.out.println(arr);
		}
	}

	// Print Seleneum to S*l**n***um
	private void replaceSpeciaclCharacterIncremental() {
		System.out.println("convert seleneum to s*l**n***um");
		String s = "Seleneum";
		int count = 0;
		String output = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == 'e') {
				count++;
				for (int j = 0; j < count; j++) {
					output = output + "*";
				}
			} else {
				output = output + c;
			}
		}
		System.out.println(output);
	}

	private void mani() {

		String s = "mani";
		String output = "";

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				output = output + s.charAt(i);
			} else if (i == s.length() - 1) {
				output = output + " " + s.charAt(i);
			}
			output = output.replace(" ", s.valueOf(s.length()));
		}
		System.out.println(output);// m4i
	}

	public void reverseList() {

		String s1 = "123456";
		char[] ch = s1.toCharArray();
		List<Character> li = new ArrayList<Character>();

		for (Character character : ch) {
			li.add(character);
		}
		Collections.reverse(li);
		Iterator<Character> iterator = li.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(Collections.min(li));
	}

	private void sortingOfStringNumbers() {
		// Sorting of Number and Characters
		String s1 = "58945612";
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);// 12455689
	}

	// Find Largest of Two Numbers
	private void find_Largest_of_Two_Numbers() {
		System.out.println("Find the Largest of Two  Number with using if conition");
		int a = 10;
		int b = 20;
		int largest = a > b ? a : b;
		System.out.println(largest + "\n");
	}

	private void mergeAndSortTwoArrays() {
		int[] arr1 = { 1, 3 };
		int n1 = arr1.length;
		int[] arr2 = { 2, 4, 6, 8 };
		int n2 = arr2.length;
		int[] arr3 = new int[n1 + n2];
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n1)
			arr3[k++] = arr1[i++];
		while (j < n2)
			arr3[k++] = arr2[j++];
		System.out.println("Array after merging");
		for (int l = 0; l < n1 + n2; l++)
			System.out.print(arr3[l] + " ");
	}

	private void reverseNumber() {
		// Reverse the Number 123 and Check for Palindrome Number
		int num = 12221;
		int rev = 0;
		int palindrome = num;
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		System.out.println(rev);
		if (rev == palindrome) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}

	private void countdigit() {
		int num = 123456;
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println("number of Digis :" + count + "\n");
	}

	private void amstrongrNumber() {
		System.out.println("Find out Amstrong Number");
		int no = 153;
		int amsr = 0;
		int amse = no;
		while (no > 0) {
			int rem = no % 10;
			amsr = amsr + (rem * rem * rem);
			no /= 10;
		}
		System.out.println(amsr);
		if (amsr == amse) {
			System.out.println("Amstrong Number" + "\n");
		} else {
			System.out.println("Not a Amstring NUmber" + "\n");
		}
	}

	private void sumOfDigits() {
		System.out.println("Find the sum of Digits");
		int num = 123546;
		int sum = 0;
		while (num > 0) {
			int no = num % 10;
			sum = sum + no;
			num = num / 10;
		}
		System.out.println(sum + "\n" + "---------------------");
	}

	private void swapTwoNumbers() {
		// Swap Two Numbers
		int a = 10;
		int b = 20;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a :" + a);
		System.out.println("b :" + b + "\n" + "----------------------");
	}

	private void removeDuplicatesInString() {
		String s = "i love india";
		Set set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			set.add(c);

		}
		System.out.println(set);
	}

	private void incrementalOfString() {
		String string = "demo";
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (i >= j) {
					System.out.print(string.charAt(i));
				}
			}
		}
	}

	private void swapTwoNumbersWithOut3rdVariable() {
		int a = 10;
		int b = 20;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a :" + a);
		System.out.println("b :" + b + "\n" + "----------------------");
	}

	private void factorialNumber() {
		int a = 5;
		int fact = 1;
		while (a > 0) {
			fact = fact * a;
			a -= 1;
		}
		System.out.println(fact + "\n" + "----------------------");
	}

	private void primeNumber() {
		int a = 12;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime Number" + "\n" + "----------------------");
		} else {
			System.out.println("Not a prime Number" + "\n" + "----------------------");
		}
	}

	private void printPrimeNumber() {

		for (int i = 1; i <= 50; i++) {
			int count = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

	private void reverseFirstWordOnly() {

		String s = "Sahubar Sathik";
		System.out.println(s.length());
		String substring = s.substring(0, 7);
		String substring2 = s.substring(7, s.length());
		System.out.println(substring);
		StringBuffer s1 = new StringBuffer();
		s1.append(substring);
		System.out.println(s1.reverse());
		String rev = s1 + substring2;
		System.out.println(rev);
	}

	private void ascendingOrderOfArray() {
		// WithOut Using any special method
		System.out.println("WithOut Using any special method");
		int[] array = new int[5];
		array[0] = 20;
		array[1] = 40;
		array[2] = 50;
		array[3] = 43;
		array[4] = 77;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Maximum Number is : " + array[4]);
		System.out.println("Minimum Number is : " + array[0]);
		// Inbuild method
		System.out.println("Inbuild method");
		int[] ar = new int[] { 20, 10, 60, 50, 5, 11, 56, 89 };
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
	}

	private void star() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");

			}
			System.out.println();

		}
	}

	private void descendingOfArray() {

		int[] array = new int[6];
		array[0] = 20;
		array[1] = 40;
		array[2] = 50;
		array[3] = 43;
		array[4] = 77;
		array[5] = 23;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	private void printDuplicatesInArray() {
		int[] arr = new int[7];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 8;
		arr[5] = 6;
		arr[6] = 9;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	private void removeDuplicatesInArray() {

		int[] arr = new int[7];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 8;
		arr[5] = 6;
		arr[6] = 9;

		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
	}

	private void printNumberOFCharacter() {
		String s = "sathikdme@gmail.com";
		char[] ch = s.toCharArray();
		System.out.println("Number of Character : " + ch.length);
	}

	private void numberOfWordsInString() {
		String s = "My Name is Sahubar Sathik";
		String[] split = s.split(" ");
		String s1 = split[1];
		System.out.println("Number of Words : " + split.length);
	}

	private void printVowlesCount1() {
		String s = "Perfection is an Illution";
		char[] ch = s.toCharArray();

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

	private void printNumberOfWord() {
		String s = "The World is Full of Stupid Peoples";
		String[] split = s.split(" ");
		System.out.println(split.length);
	}

	private void removeMutlipleNo() {
		String s = "Hello123World456";
		char[] ch = s.toCharArray();
		String output = "";
		String[] part = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		String output1 = part[0] + " " + part[2];
		System.out.println(output1);
		System.out.println(part[0]);
		System.out.println(part[1]);
		System.out.println(part[2]);
		System.out.println(part[3]);

		for (int i = 0; i < ch.length; i++) {
			if (!Character.isDigit(ch[i])) {

				output = output + ch[i];
			}
		}
		System.out.println(output);
	}

	private void seperateNumberAphaSplChar() {
		String s = "Sa12hu3bar&%sa*&th7K";
		char[] ch = s.toCharArray();
		String alpha = "";
		String num = "";
		String spl = "";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				alpha = alpha + ch[i];
			} else if (Character.isDigit(ch[i])) {
				num = num + ch[i];

			} else {
				spl = spl + ch[i];
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);
	}

	private void replaceWithNoIncremental() {
		String s = "Entertainment";
		String output = "";
		char toReplace = 't';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			output = output + ch;
			if (ch == toReplace) {
				count++;
				output = output.replaceFirst(String.valueOf(toReplace), String.valueOf(count));
			}
		}
		System.out.println(output);
	}

	private void webTable() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		String country = "Algeria";

		List<WebElement> countries = driver.findElements(By.xpath("//tbody//tr//td[2]//strong"));

		for (int i = 0; i < countries.size(); i++) {
			String name = countries.get(i).getText();

			if (name.equals(country)) {
				WebElement checkBox = driver.findElement(
						By.xpath("//tbody//tr//td[2]//strong[contains(text(),'" + country + "')]/../../td[1]/input"));
				checkBox.click();
			}
		}
	}

	private void countcapssmallspl() {
		String s = "The World is Full of Stupid Peoples";
		int caps = 0, sml = 0, spl = 0, digit = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				caps++;
			} else if (Character.isLowerCase(c)) {
				sml++;

			} else if (Character.isDigit(i)) {
				digit++;
			} else {
				spl++;

			}
		}
		System.out.println("The Numb	er of Capital : " + caps);
		System.out.println("The Number of Small : " + sml);
		System.out.println("The Number of Digits : " + digit);
		System.out.println("The Number of Special : " + spl);
	}

	private void occuranceOfCharacter() {

		String s = "ljncueohUUUUnk";
		s = s.toLowerCase();
		char c = 'u';
		int occurance = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				occurance++;
			}
		}
		System.out.println(c + "=" + occurance);

		// Without Using Iteration
		String input = "jumanjeeeeee";
		input = input.toLowerCase();
		String toCount = "e";
		String output = input.replaceAll(toCount, "");
		System.out.println(input.length() - output.length());
	}

	private void passwordHiding() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter email");
		String email = s.nextLine();
		String output = "";
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (i == 0 || i == email.length() - 1) {
				output = output + c;

			} else {
				output = output + "*";
			}
		}

		System.out.println(output);
	}

	private void occuranceOfEachCharacter() {
		// count occurance of each character
		String s = "some of the most generious Peoples don't have heart";

		Map<Character, Integer> mp = new HashMap<>();
		char[] arry = s.toCharArray();
		for (char c : arry) {

			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);

			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

	private void stringToSort() {
		String s = "5482631";

		int[] intArray = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			intArray[i] = Character.getNumericValue(s.charAt(i));
		}

		Arrays.sort(intArray);
		String string = Arrays.toString(intArray);
		System.out.println(string);
	}

	private void pairOfNumbers() {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						found = true;
					}
				}
			}
		}
		if (found == false)
			System.out.println(" not exist ");
	}

	public static void main(String[] args) {
		WorkOut e = new WorkOut();
		// e.reverseString();
		// e.reverseEachWord();
		// e.printVowelsCount();
		// e.printNumberOfLetters();
		// e.removeArrayDuplicates();
		// e.reverseList();
		// e.find_Largest_of_Two_Numbers();
		// e.replaceSpeciaclCharacterIncremental();
		// e.reverseNumber();
		// e.countdigit();
		// e.amstrongrNumber();
		// e.sumOfDigits();
		// e.swapTwoNumbers();
		// e.swapTwoNumbersWithOut3rdVariable();
		// e.factorialNumber();
		// e.primeNumber();
		// e.printPrimeNumber();
		// e.reverseFirstWordOnly();
		// e.reverseString2();
		// e.ascendingOrderOfArray();
		// e.descendingOfArray();
		// e.printDuplicatesInArray();
		// e.removeDuplicatesInArray();
		// e.printNumberOFCharacter();
		// e.numberOfWordsInString();
		// e.printVowlesCount1();
		// e.printNumberOfWord();
		// e.removeMutlipleNo();
		// e.seperateNumberAphaSplChar();
		// e.replaceWithNoIncremental();
		// e.webTable();
		// e.occuranceOfCharacter();
		// e.occuranceOfEachCharacter();
		// e.stringToSort();
		e.star();

	}

}
