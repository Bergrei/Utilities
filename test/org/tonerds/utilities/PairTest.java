package org.tonerds.utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairTest {
	
	@Test
	void testContainsInt() {
		Integer i = 2;
		Double d = 2.0;
		Pair<Integer, Double> pair = new Pair<>();
		pair.first = i;
		pair.second = d;
		assertTrue(pair.contains(2));
	}
	
	@Test
	void testContainsSameTypeSecond() {
		Integer i1 = 1;
		Integer i2 = 2;
		Pair<Integer, Integer> pair = new Pair<>();
		pair.first = i1;
		pair.second = i2;
		assertTrue(pair.contains(2));
	}
	
	@Test
	void testContainsString() {
		String s = "nope";
		Integer i = 2;
		Pair<Integer, String> pair = new Pair<>();
		pair.first = i;
		pair.second = s;
		assertTrue(pair.contains("nope"));
	}

	@Test
	void testNotContains() {
		Integer i1 = 1;
		Integer i2 = 2;
		Pair<Integer, Integer> pair = new Pair<>();
		pair.first = i1;
		pair.second = i2;
		assertFalse(pair.contains(3));
	}

}
