package com.example.Jogo_Cidade.model;
 import jakarta.persistence.*;


// @Entity
public class Fabrica extends Edificio {
    private int capacidadeProducao;

    public Fabrica(String nome, int capacidadeProducao, Nivel nivel) {
        super(nome, "Fábrica", nivel);
        this.capacidadeProducao = capacidadeProducao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Capacidade de Produção: " + capacidadeProducao + " unidades";
    }
}
