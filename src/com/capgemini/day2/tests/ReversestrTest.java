package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.capgemini.day2.Reversestr;
	class ReversestrTest
	{

		@Test
		void testReverseString() 
		{
			assertEquals("Priyanka ",Reversestr.findReverse("Priyanka"));
		}
	
	

}
