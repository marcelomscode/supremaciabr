package com.mscode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mscode.services.MembrosService;
import com.mscode.services.VideoService;
import org.springframework.web.servlet.ModelAndView;

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
	
	@GetMapping("/treinamento")
	public String treinamento() {
		return "treinamento/treinamento";
	}

	@GetMapping("/regimeinterno")
	public String regimeinterno(Model model){
	//	ModelAndView MV = new ModelAndView("regime/regimeinterno");
//		MV.addObject("regras", regrasDAO.listaRegras());
//		MV.addObject("regras2", regrasDAO.listaRegrasUltimos());
		return "regime/regimeinterno";
	}
	
}
