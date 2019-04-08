package com.fdmgroup.collections;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestCollectionsExercise {

	CollectionsExercise exercise;

	@Before
	public void setUp() throws Exception {
		exercise = new CollectionsExercise();
	}

	@Test
	public void test1() {
		Set<String> noDuplicates = exercise.removeDuplicates("Nick", "Ray", "Nick");
		assertEquals(2, noDuplicates.size());
	}

	@Test
	public void test2() {
		Set<String> noDuplicates = exercise.removeDuplicates("Nick", "Ray", "Nick");
		assertTrue(noDuplicates.contains("Nick"));
	}

	@Test
	public void test3() {
		Set<String> noDuplicates = exercise.removeDuplicates("Nick", "Ray", "Nick");
		assertTrue(noDuplicates.contains("Ray"));
	}

	@Test
	public void test4() {
		Map<String, Color> colors = new HashMap<String, Color>();
		colors = exercise.colors();
		assertTrue(colors.containsKey("orange"));
	}

	@Test
	public void test5() {
		Map<Character, Integer> colors2 = new HashMap<Character, Integer>();
		colors2 = exercise.countDuplicates("Hello There");
		// assertTrue(colors2.containsKey("T"));
	}

	@Test
	public void test6() {
		int result = exercise.countDuplicateWords("Hello There Hello There");
		assertEquals(2, result);
	}

	@Test
	public void test7() {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
		exercise.reverseList(list);
		// assertEquals(2, result);
	}

	@Test
	public void test8() {
		String sentence = "hello world";
		exercise.tokenize(sentence);
		// assertEquals(2, result);
	}

	@Test
	public void test9() {
		exercise.priorityQueue(2.2,14.1,18.1);
		// assertEquals(2, result);
	}

}
