package com.mscode.controller;

import com.mscode.entity.Videos;
import com.mscode.services.MembrosService;
import com.mscode.services.RegimentoServices;
import com.mscode.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    VideoService videoService;
    @Autowired
    RegimentoServices regimentoServices;
    @Autowired
    MembrosService membrosService;


    @RequestMapping("/console")
    public String balanosman(Model model){
//        ModelAndView MV = new ModelAndView("adm/adm");

        model.addAttribute("ultimoVideo", videoService.findAll());
        model.addAttribute("regras", regimentoServices.listaRegrasTodas());
        model.addAttribute("qtdmembros", membrosService.findAll());
        return "adm/adm";
    }

    @RequestMapping("/cadastraVideo")
    public String cadastraVideo(Videos videos){
        videoService.salvaVideo(videos);
        return "redirect:/adm/console";
    }


    @PostMapping("/editaVideo")
    public String editaVideo(@ModelAttribute Videos videos,Model model){
        videoService.editaVideo(videos);
        return "redirect:/adm/console";
    }

    @GetMapping("/removeVideo/{idVideo}")
    public String removeVideo(@PathVariable Long idVideo){
        videoService.removeVideo(idVideo);
        return "redirect:/adm/console";
    }


}
