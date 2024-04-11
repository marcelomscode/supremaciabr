package com.mscode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mscode.services.MembrosService;
import com.mscode.services.VideoService;

@Controller
public class HomeController {
	
    @Autowired
    private VideoService videoService;

    @Autowired
    private MembrosService membrosService;
	
	@GetMapping
	public String index(Model model) {
				
		model.addAttribute("qtdmembros", membrosService.findUniqueRecord());
        model.addAttribute("videos", videoService.listaUltimosVideo());

		return "index";
	}
	
	@GetMapping("/regimeinterno")
	public String regimento() {
		return "comum/regimentointerno";
	}
	
	
}
