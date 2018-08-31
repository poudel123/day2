package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.NumberOfOccurances;



class CheckOccurancesTest {

	@Test
	void testOccurances() {
		assertEquals(2,NumberOfOccurances.findNumberOfOccurances(new String[] {"Sam", "Priya","lauki","muskaan","Ram","George","Sam"}, new String("Sam")));
		
	}
//		fail("Not yet implemented");

}