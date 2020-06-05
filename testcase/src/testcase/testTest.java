package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import testcase3.test3;

class testTest {
    test a = new test();
	@Test
	void testAdd1() {
		assertEquals(a.add(1,2),3);
	}
	@Test
	void testAdd2() {
		assertEquals(a.add(2000000000,1000000000),3000000000.0);
	}
	@Test
	void testAdd3() {
		assertEquals(a.add(-1000000000,-2000000000),-3000000000.0);
	}
	@Test
	void testSub1() {
		assertEquals(a.sub(2,1),1);
	}
	@Test
	void testSub2() {
		assertEquals(a.sub(-2000000000,1000000000),-3000000000.0);
	}
	@Test
	void testSub3() {
		assertEquals(a.sub(2000000000,-1000000000),3000000000.0);
	}
	@Test
	void testMul1() {
		assertEquals(a.mul(2,3),6);
	}
	@Test
	void testMul2() {
		assertEquals(a.mul(2000000000,2000000000),4000000000.0);
	}
	@Test
	void testMul3() {
		assertEquals(a.mul(-2000000000,-2000000000),-4000000000.0);
	}
	@Test
	void testDiv1() {
		assertEquals(a.div(6,2),3);
	}
	@Test
	void testDiv2() {
		assertEquals(a.div(6,0),-12711237);
	}
	@Test
	void testDiv3() {
		assertEquals(a.div(5,2),2.5);
	}

}
