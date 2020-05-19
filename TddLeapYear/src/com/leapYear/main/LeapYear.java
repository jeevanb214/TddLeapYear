package com.leapYear.main;

public class LeapYear {

	boolean flag = false;

	public boolean checkLeapYear(int year) {
		if (year % 400 == 0) {
			flag = true;
			return flag;
		} else
			return false;
	}

}
