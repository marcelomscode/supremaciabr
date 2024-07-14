package com.mscode.controller;

import com.mscode.services.RegimentoServices;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
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

	@Autowired
	RegimentoServices regimentoServices;

	private final RabbitTemplate rabbitTemplate;

    public HomeController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


	@GetMapping
	public String index(Model model, boolean email) {
				
		model.addAttribute("qtdmembros", membrosService.findUniqueRecord());
        model.addAttribute("videos", videoService.listaUltimosVideo());
		model.addAttribute("email", email);
		return "index";
	}

	@GetMapping("/treinamento")
	public String treinamento() {
		return "treinamento/treinamento";
	}

	@GetMapping("/calendario")
	public String calendario() {
		return "calendario/calendario";
	}

	@GetMapping("/recrutamento")
	public String recrutamento() {
		return "recrutamento/recrutamento";
	}

	@GetMapping("/regimeinterno")
	public String regimeinterno(Model model){

		model.addAttribute("regras", regimentoServices.listaRegras());
		return "regime/regimeinterno";
	}

}
