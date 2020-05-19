package com.leapYear.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
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

	// All years divisible by 100 but not by 400 are NOT leap years (so, for
	// example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap
	// year),
	@Nested
	class testWith100NotBy400 {

		@Test
		void test1() {
			assertEquals(false, ly.checkLeapYear(1700));
		}

		@Test
		void test2() {
			assertEquals(false, ly.checkLeapYear(1800));
		}

		@Test
		void test3() {
			assertEquals(false, ly.checkLeapYear(1900));
		}

		@Test
		void test4() {
			assertEquals(false, ly.checkLeapYear(2100));
		}
	}

	// All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012,
	// 2016),
	@Nested
	class testWith4NotBy100 {

		@Test
		void test1() {
			assertEquals(true, ly.checkLeapYear(2008), "leap Year");
		}

		@Test
		void test2() {
			assertEquals(true, ly.checkLeapYear(2012), "leap Year");
		}

		@Test
		void test3() {
			assertEquals(true, ly.checkLeapYear(2016), "leap Year");
		}
	}

	// All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
	@Nested
	class testNotdivisibleBy4 {

		@Test
		void test1() {
			assertEquals(true, ly.checkLeapYear(2017));
		}

		@Test
		void test2() {
			assertEquals(true, ly.checkLeapYear(2018));
		}

		@Test
		void test3() {
			assertEquals(true, ly.checkLeapYear(2019));
		}
	}

}
