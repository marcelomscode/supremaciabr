package com.mscode.controller;

import com.mscode.entity.Regimento;
import com.mscode.entity.Videos;
import com.mscode.services.MembrosService;
import com.mscode.services.RegimentoServices;
import com.mscode.services.VideoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/adm")
public class AdmController {

    @Autowired VideoService videoService;
    @Autowired RegimentoServices regimentoServices;
    @Autowired MembrosService membrosService;

    @RequestMapping("/console")
    public String balanosman(Model model){
//        ModelAndView MV = new ModelAndView("adm/adm");

        model.addAttribute("ultimoVideo", videoService.findAll());
        model.addAttribute("qtdmembros", membrosService.findAll());
        model.addAttribute("regras", regimentoServices.listaRegrasTodas());
        model.addAttribute("regimento", new Regimento());
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

    @PostMapping("/cadastraRegras")
    public String cadastraRegras(@Valid Regimento regimento, BindingResult result){

        boolean thereAreErrors = result.hasErrors();
        if (thereAreErrors) {
            return "adm/adm";
        }

        regimentoServices.criaRegra(regimento);
        return "redirect:/adm/console";
    }

    @PostMapping("/editaRegras")
    public String editaRegras(@Valid @ModelAttribute Regimento regras, Model model, BindingResult result){

        boolean thereAreErrors = result.hasErrors();
        if (thereAreErrors) {
            return "adm/console";
        }

        regimentoServices.editaRegra(regras);
        return "redirect:/adm/console";
    }

     @GetMapping("/removeRegra/{idRegra}")
    public String removeRegra(@PathVariable Long idRegra){
         regimentoServices.removeRegra(idRegra);
        return "redirect:/adm/console#regras";
    }

    @GetMapping("/testeError")
    public String testeError(Model model){

        Regimento regimento = new Regimento();
        regimento.setSubTituloDescricao("teste");
        regimento.setTitulo("teste");
        regimento.setTituloRegimento("teste");
        regimento.setActive(true);
        regimento.setIdRegimento(1);

        model.addAttribute("regimento", regimento);
        return "/adm/testeError";
    }

    @PostMapping("/editaError")
    public String editaError(@Valid Regimento regimento, BindingResult result){

        boolean thereAreErrors = result.hasErrors();
        if (thereAreErrors) {
          return "adm/testeError";
        }
        return "redirect:/adm/testeError";
    }






}
