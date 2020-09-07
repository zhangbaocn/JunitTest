package cn.jtp.l002;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.jtp.l002.MessageUtil;

public class MessageUtilTest {

	@Test
	public void testPrintMessage1() {

		String message = "Hello Junit1";
		MessageUtil messageUtil = new MessageUtil(message);
		assertEquals("print" + message, messageUtil.printMessage());
	}

	@Test
	public void testPrintMessage2() {
		String message = "Hello Junit2";
		MessageUtil messageUtil = new MessageUtil(message);
		assertEquals("print" + message, messageUtil.printMessage());
	}

	@Test
	public void testPrintMessage3() {
		String message = "Hello Junit3";
		MessageUtil messageUtil = new MessageUtil(message);
		assertEquals("print" + message, messageUtil.printMessage());
	}

}
