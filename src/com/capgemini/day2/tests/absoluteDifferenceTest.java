package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.capgemini.day2.AbsoluteDifference;


class absoluteDifferenceTest  {

	

	@Test
	void testfindAbsoluteDifference() {
		//fail("Not yet implemented");
		assertEquals(1, AbsoluteDifference.findAbsoluteDifference(8,new int [] {1,2,3,4,5,4,3,2},5));
	}


}
