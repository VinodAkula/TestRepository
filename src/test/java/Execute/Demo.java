package Execute;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class Demo {

	

	@Test	
	public void Sum()
	{
		System.out.println("Sum");
		int a = 10;
		int b=20;
		Assert.assertEquals(30, b+a);
	}
	@AfterClass
	public void afterclass() throws EmailException {
		SendEmailJava.sendemail();
	}
	
	
}
