package cn.jtp;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest001Test {

	@Test
	public void testM001() {
		JunitTest001 jt001 = new JunitTest001();
		String in = "abc";
		assertEquals("abcm001", jt001.m001(in));
	}

}
