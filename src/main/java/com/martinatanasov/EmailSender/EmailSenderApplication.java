package com.martinatanasov.EmailSender;

import com.martinatanasov.EmailSender.entity.Message;
import com.martinatanasov.EmailSender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {

//	@Autowired
//	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail(){
//		Message messageData = new Message("test@abv.bg",
//				"promotion of new product",
//				"Hello, this is a test2!");
//		emailSenderService.sendSimpleEmail(messageData);
//	}

}
