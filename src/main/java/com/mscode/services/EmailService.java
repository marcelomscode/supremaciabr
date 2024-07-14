package com.mscode.services;

import com.mscode.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(Email email) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("contato@marcelomscode.com.br");
            message.setTo(email.email());
            message.setBcc("marcelo@marcelomscode.com.br");
            message.setSubject(email.name() + " Obrigado por seu interesse no Comando SMBR");
            message.setText("Em breve um oficial do comando entrará em contato com você por email.");
            javaMailSender.send(message);
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
