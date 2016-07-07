package project.junit;

import org.junit.Test;

import junit.framework.Assert;

public class TestJunit { 
	String message = "Hello World"; 
	MessagePrint messagePrint = new MessagePrint(message);
	@Test
	public void testPrintMessage() { 
		Assert.assertEquals(message,messagePrint.printMessage()); 
	} 
}