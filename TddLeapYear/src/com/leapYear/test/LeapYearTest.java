package com.leapYear.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.leapYear.main.LeapYear;

class LeapYearTest {
	private LeapYear ly;

	@BeforeEach
	private void getInstance() {
		ly = new LeapYear();
	}

	// All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a
	// leap year).
	@Test
	void testWith400() {
		assertEquals(true, ly.checkLeapYear(2000));
	}

}
