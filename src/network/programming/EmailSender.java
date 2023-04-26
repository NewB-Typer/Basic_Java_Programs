package network.programming;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
   public static void main(String[] args) {

      String to = "recipient@example.com"; // recipient email address
      String from = "sender@example.com"; // sender email address
      String host = "smtp.example.com"; // SMTP server address smtp.yahoo.com

      Properties properties = System.getProperties();
      properties.setProperty("mail.smtp.host", host); 
//mail.yahoo.com
      Session session = Session.getDefaultInstance(properties);

      try {
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
         message.setSubject("This is the subject of the email");
         message.setText("This is the body of the email");

         Transport.send(message);
         System.out.println("Email sent successfully");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}

