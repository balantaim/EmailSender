package com.martinatanasov.EmailSender.service;

import com.martinatanasov.EmailSender.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${base.email.sender}")
    private String sendFrom;

    public void sendSimpleEmail(Message messageData){
        System.out.println("Email sender: " + sendFrom);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sendFrom);
        message.setTo(messageData.getToEmail());
        message.setSubject(messageData.getSubject());
        message.setText(messageData.getBody());

        javaMailSender.send(message);

        System.out.println("Email send!");
    }
}
