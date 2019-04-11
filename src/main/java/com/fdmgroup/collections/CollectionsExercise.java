package com.fdmgroup.collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsExercise{
	

	public Set<String> removeDuplicates(String... names) {
		Set<String> name = new HashSet<String>(Arrays.asList(names));

		return name;
	}

	public Map<String, Color> colors() {
		Map<String, Color> colors = new HashMap<String, Color>();
		colors.put("black", Color.black);
		colors.put("blue", Color.blue);
		colors.put("cyan", Color.cyan);
		colors.put("gray", Color.gray);
		colors.put("green", Color.green);
		colors.put("darkgray", Color.darkGray);
		colors.put("lightgray", Color.lightGray);
		colors.put("magenta", Color.magenta);
		colors.put("orange", Color.orange);
		colors.put("pink", Color.pink);
		colors.put("red", Color.red);
		colors.put("white", Color.white);
		colors.put("yellow", Color.yellow);

		/*
		 * for(String color1 : colors.keySet()){
		 * System.out.println(colors.get(color1)); }
		 */
		return colors;
	}

	public Map<Character, Integer> countDuplicates(String name) {
		int len = name.length();
		name = name.toUpperCase();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>();

		for (int i = 0; i < len; i++) {
			char charAt = name.charAt(i);

			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}

		System.out.println(numChars);
		return numChars;
	}

	public int countDuplicateWords(String sentence) {

		List<String> list = Arrays.asList(sentence.split(" "));

		Set<String> uniqueWords = new HashSet<String>(list);
		/*
		 * for (String word : uniqueWords) { System.out.println(word + ": " +
		 * Collections.frequency(list, word));
		 * 
		 * }
		 */
		int numberOfDuplicates = list.size() - uniqueWords.size();
		System.out.println(numberOfDuplicates);

		return numberOfDuplicates;
	}

	public LinkedList<Integer> reverseList(LinkedList<Integer> list1) {

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		//System.out.println(list1.size());
		for (int i = list1.size() - 1; i >= 0; i--) {
			list2.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		return list2;
	}

	public TreeSet<String> tokenize(String str) {
		//List<String> list = Arrays.asList(str.split(" "));
		Set<String> words = new TreeSet<String>(Arrays.asList(str.split(" ")));
		for (String string : words) {
			System.out.println(string);
		}
		return (TreeSet<String>) words;
	}
	
	public Double[] priorityQueue(Double... numbers) {
		Queue<Double> numberList  = new PriorityQueue<Double>(numbers.length, Collections.reverseOrder());
	for(Double number: numbers){
		numberList.add(number);
	}
	for(Double number: numbers){
		System.out.println(numberList.poll());
	}
		return numbers;
		
	}

}
