package com.capgemini.day2.tests;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.LoginCheck;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

	@Test
	void testLogin() {
		assertEquals("Welcome", LoginCheck.checkLoginDetails("Priyanka", "8955abc"));
		assertEquals("Invalid Credentials, Contact the Admin", LoginCheck.checkLoginDetails("Priyanka", "8950abc"));
		
//		fail("Not yet implemented");
	}

}