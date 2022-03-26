package com.bookstore.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int a=10;
		int b=20;
		int res=cal.add(a, b);
		int exp=30;
		assertEquals(res, exp);
	}

}
