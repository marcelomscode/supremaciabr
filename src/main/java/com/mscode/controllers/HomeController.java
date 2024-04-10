package com.mscode.controllers;

import com.mscode.services.MembrosService;
import com.mscode.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private MembrosService membrosService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("qtdmembros", membrosService.findAll());
        model.addAttribute("videos", videoService.findAll());

        return "index";
    }


}
