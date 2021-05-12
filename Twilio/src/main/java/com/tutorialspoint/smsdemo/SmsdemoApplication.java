package com.tutorialspoint.smsdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SmsdemoApplication implements ApplicationRunner {
   private final static String ACCOUNT_SID = "<your-account-sid>";
   private final static String AUTH_ID = "<your-auth-id>";

   static {
      Twilio.init(ACCOUNT_SID, AUTH_ID);
   }
   public static void main(String[] args) {
      SpringApplication.run(SmsdemoApplication.class, args);
   }
   @Override
   public void run(ApplicationArguments arg0) throws Exception {
      Message.creator(new PhoneNumber("6301589422"), new PhoneNumber("9492141410"),
         "Message from Spring Boot Application").create();
   }
}