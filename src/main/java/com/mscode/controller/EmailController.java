package com.mscode.controller;

import com.mscode.Email;
import com.mscode.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")
    public String sendEmail(Email email, Model model) {
        emailService.sendEmail(email);

        model.addAttribute("email", true);

        return "redirect:/?email=true";
    }

}
