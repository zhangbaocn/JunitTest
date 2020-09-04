package cn.jtp.l001;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.jtp.l001.Junit;

public class JunitTest {

	@Test
	public void testM001() {
		Junit jt001 = new Junit();
		String in = "abc";
		assertEquals("m001abc", jt001.m001(in));
	}

}
