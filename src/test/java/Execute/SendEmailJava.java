package Execute;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	
	public static void sendemail() throws EmailException
	{
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("andrew74444@gmail.com", "1237asdf"));
	email.setSSLOnConnect(true);
	email.setFrom("no-reply@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("vk28756@gmail.com");
	email.send();
	}
	
}
