package com.example.Jogo_Cidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Jogo_Cidade.controller.CidadeRepository;
import com.example.Jogo_Cidade.model.Cidade;
import com.example.Jogo_Cidade.model.Edificio;

import java.util.Random;


@Service
public class CidadeService {
    
    @Autowired
    private final CidadeRepository CidadeRepository;

    public Cidade getCidade(Long id) {
        return CidadeRepository.findById(id).orElseThrow(() -> new RuntimeException("Cidade não encontrada"));
    }

    public Edificio adicionarEdificio(Long cidadeId, Edificio request) {
        Cidade cidade = getCidade(cidadeId);
        Edificio edificio = new Edificio(request.getNome(), request.getNivel());
        
        double custo = edificio.getNivel().getCusto();
        if (cidade.getOrcamento() >= custo) {
            cidade.gastarOrcamento(custo);
            // Lógica para salvar o edifício
        } else {
            throw new RuntimeException("Orçamento insuficiente.");
        }
        
        CidadeRepository.save(cidade);
        return edificio;
    }

    public String desencadearEventoAleatorio(Long cidadeId) {
        Cidade cidade = getCidade(cidadeId);
        Random rand = new Random();
        int eventoAleatorio = rand.nextInt(3);

        switch (eventoAleatorio) {
            case 0:
                cidade.gastarOrcamento(20000);
                return "Crise Econômica";
            case 1:
                cidade.gastarOrcamento(15000);
                return "Desastre Natural";
            case 2:
            default:
                cidade.adicionarOrcamento(25000);
                return "Investimento Externo";
        }
    }
}
