package com.in28minutes.unit.testing.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.in28minutes.unit.testing.lab.StringHelper;

class StringHelperTestIntermediate {

	StringHelper helper = new StringHelper();

	@Test
	void testReplaceAInFirst2Positions() {
		//Ideally, you want to write each test case in a separate test method
		//HOWEVER, for simple tests, its OK to have multiple test cases in a test 
		
		assertEquals("BCD", helper.replaceAInFirst2Positions("ABCD"));
		assertEquals("CD", helper.replaceAInFirst2Positions("AACD"));
		assertEquals("BCD", helper.replaceAInFirst2Positions("BACD"));
		assertEquals("AA", helper.replaceAInFirst2Positions("AAAA"));
		assertEquals("MNAA", helper.replaceAInFirst2Positions("MNAA"));
		
		//edge cases
		assertEquals("", helper.replaceAInFirst2Positions(""));
		assertEquals("", helper.replaceAInFirst2Positions("A"));
		assertEquals("", helper.replaceAInFirst2Positions("AA"));
		assertEquals("B", helper.replaceAInFirst2Positions("B"));
		assertEquals("BC", helper.replaceAInFirst2Positions("BC"));
	}
}