package com.example.Jogo_Cidade.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class CidadeController {
    @GetMapping("/Cadastro_edificio")
    public ModelAndView RotaCadastro(){
        ModelAndView mv = new ModelAndView("cadastro_Edificio");
        return mv;
    }

    @GetMapping("/")
    public ModelAndView RotaLogin(){
        ModelAndView mv = new ModelAndView("tela_login");
        return mv;
    }
    @GetMapping("/Cadastro_transporte")
        public ModelAndView RotaTransporte(){
            ModelAndView mv = new ModelAndView("cadastro_transporte");
            return mv;

    }


    // private CidadeService cidadeService;

    // @GetMapping("/{id}")
    // public Cidade getCidade(@PathVariable Long id) {
    //     return cidadeService.getCidade(id);
    // }

    // @PostMapping("/{id}/adicionarEdificio")
    // public Edificio adicionarEdificio(@PathVariable Long id, @RequestBody Edificio request) {
    //     return cidadeService.adicionarEdificio(id, request);
    // }

    // @PostMapping("/{id}/desencadearEvento")
    // public String desencadearEvento(@PathVariable Long id) {
    //     return cidadeService.desencadearEventoAleatorio(id);
    // }
}
