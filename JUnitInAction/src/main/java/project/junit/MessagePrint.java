package project.junit;

/* 
 * This class prints the given message on console. 
 */ 
public class MessagePrint { 
	private String message; 
	
	public MessagePrint(String message){ 
		this.message = message; 
	} 
	
	public String printMessage(){ 
		//System.out.println(message); 
		return message;
		//return "Greska!";
	} 
}
