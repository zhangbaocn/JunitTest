package cn.jtp.l002;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.jtp.l002.MessageUtil;

public class MessageUtilTest {

	String message = "Hello Junit";

	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage1() {

		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testPrintMessage2() {
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testPrintMessage3() {
		assertEquals(message, messageUtil.printMessage());
	}

}
