package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testPercentageOfTax() {
		//fail("Not yet implemented");
		assertEquals(0,IncomeTax.PercentageOfTax(100000));
		assertEquals(20000,IncomeTax.PercentageOfTax(200000));
		assertEquals(80000,IncomeTax.PercentageOfTax(400000));
		assertEquals(180000,IncomeTax.PercentageOfTax(600000));
		
	}

}
