import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;

public class SendMail {

	public static void main(String[] args) throws EmailException, MalformedURLException {
		
		// Create the email message
		  /*HtmlEmail email = new HtmlEmail();
		 
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("andrew74444@gmail.com", "1237asdf"));
		email.setSSLOnConnect(true);
		email.setFrom("no-reply@gmail.com","no-reply");
		email.setSubject("Test Mail");
		email.addTo("vk28756@gmail.com");
		*/
		
		/*
		  EmailAttachment attachment = new EmailAttachment();

		attachment.setPath("E:/ConnetProNet/test-output/emailable-report.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("emailable-report");
		  attachment.setName("SasiVinodAkula");

		  */
		  
		
		 		
		
		  // Create the email message
		  //MultiPartEmail email = new MultiPartEmail();
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("andrew74444@gmail.com", "1237asdf"));
		  email.setSSLOnConnect(true);
		  email.addTo("vk28756@gmail.com");
		  email.setFrom("vk28756@gmail.com","no-reply");
		  email.setSubject("emailable-report");
/*		 
		  

		  // embed the image and get the content id
		  URL url = new URL("file:///E:/Seleniun36/test-output/emailable-report.html");
		  String cid = email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setContent(url.toString(), "text/html");
		  email.setHtmlMsg("<html><img src=\"cid:" + cid + "\"/><h1>Congratulations</h1>" + "\n"
		            + "You have just won the nobel prize!</html>");

		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();

	*/	  
		  
		  // add the attachment
		  /*email.attach(attachment);*/

		  // send the email
		//  email.send();
		
		
		
		
		/*// embed the image and get the content id
		  URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
		  String cid = email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");

		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();*/
		
		
	}

}
