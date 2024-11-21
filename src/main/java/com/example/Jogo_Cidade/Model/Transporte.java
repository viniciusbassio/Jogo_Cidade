package com.example.Jogo_Cidade.model;

import jakarta.persistence.*;
public class Transporte extends Edificio {
    private int capacidade;
    private String tipoTransporte;

    public Transporte(String nome, int capacidade, String tipoTransporte, Nivel nivel) {
        super(nome, "Transporte", nivel);
        this.capacidade = capacidade;
        this.tipoTransporte = tipoTransporte;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: " + tipoTransporte + " (Capacidade: " + capacidade + ")";
    }
}
