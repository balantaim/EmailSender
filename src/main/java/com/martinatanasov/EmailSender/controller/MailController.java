package com.martinatanasov.EmailSender.controller;

import com.martinatanasov.EmailSender.entity.Message;
import com.martinatanasov.EmailSender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MailController {

//    @Autowired
    private final EmailSenderService emailSenderService;

    @Autowired
    public MailController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;

    }

    @PostMapping("/send-email")
    public String sendEmail(@RequestParam("targetEmail") String targetEmail){
        System.out.println("Target email: " + targetEmail);

        Message messageData = new Message(
                targetEmail,
                "promotion of new product",
                "Hello, this is a test3!");
        emailSenderService.sendSimpleEmail(messageData);
        return "Email Send!";
    }

}
