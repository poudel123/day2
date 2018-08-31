package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.changeDateFormat;

class DateTest {

	@Test
	void testdateFormatChange() {
		//fail("Not yet implemented");
		assertEquals("19/jul/1999",changeDateFormat.dateFormatChange("19,07,1999"));
	}

}
