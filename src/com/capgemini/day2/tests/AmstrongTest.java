package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongNumber;

class AmstrongTest {

	@Test
	void testcheckArmstrongNumber() {
		//fail("Not yet implemented");
		assertEquals(true,ArmstrongNumber.checkArmstrongNumber(153));
		assertEquals(true,ArmstrongNumber.checkArmstrongNumber(370));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(253));
		assertEquals(true,ArmstrongNumber.checkArmstrongNumber(-153));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(0456));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber('s'));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(0X123));
	}

}
