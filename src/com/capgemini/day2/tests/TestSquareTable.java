package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SquareTable;

class TestSquareTable {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(25,SquareTable.findSquare(5));
		assertEquals(25,SquareTable.findSquare(-5));
		assertEquals(0,SquareTable.findSquare(0));
		assertEquals(25,SquareTable.findSquare(5));
		assertEquals(0.25,SquareTable.findSquare(0.5));
	}

}