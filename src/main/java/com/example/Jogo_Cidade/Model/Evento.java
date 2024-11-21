package com.example.Jogo_Cidade.model;
import jakarta.persistence.*;

class Evento {
    private String nome;
    private String descricao;
    private double impactoOrcamento;

    public Evento(String nome, String descricao, double impactoOrcamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.impactoOrcamento = impactoOrcamento;
    }

    public void aplicarEvento(Cidade cidade) {
        cidade.gastarOrcamento(impactoOrcamento);
        //JOptionPane.showMessageDialog(null, "Evento: " + nome + "\nDescrição: " + descricao + "\nImpacto no orçamento: -" + impactoOrcamento);
    }
}