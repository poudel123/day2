package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongRange;

class AmstrongRangeTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers(100, 1000));
	}

}
