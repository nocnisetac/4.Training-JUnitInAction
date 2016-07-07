package project.junit;

import org.junit.Test; 
import org.junit.Ignore; 
import static org.junit.Assert.assertEquals; 
public class TestJunit4 { 
	String message = "Robert"; 
	MessageUtil messageUtil = new MessageUtil(message); 
	@Test(expected = ArithmeticException.class) 
	public void testPrintMessage() { 
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage(); 
	} 
	@Test 
	public void testSalutationMessage() { 
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert"; 
		assertEquals(message,messageUtil.salutationMessage()); 
	} 
}
