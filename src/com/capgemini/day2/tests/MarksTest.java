package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SubjectMarks;

class MarksTest {

	@Test
	void testevaluation() {
		assertEquals("Passed",SubjectMarks.evaluation(67,67,67));
		assertEquals("Promoted",SubjectMarks.evaluation(47,77,67));
		assertEquals("Failed",SubjectMarks.evaluation(59,42,35));
		assertEquals("Promoted",SubjectMarks.evaluation(67,35,97));
		assertEquals("Passed",SubjectMarks.evaluation(67,73,61));
		assertEquals("Promoted",SubjectMarks.evaluation(67,67,27));
		assertEquals("Failed",SubjectMarks.evaluation(16,25,38));
	
	}
}
