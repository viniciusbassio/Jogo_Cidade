package com.example.Jogo_Cidade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
    
    @GetMapping("/Menu")
    public ModelAndView RotaPrincipal(){
    ModelAndView mv = new ModelAndView("Menu.html");/*Quando for chamar a rota precisa do tipo do arquivo*/
    return mv;
}
}
