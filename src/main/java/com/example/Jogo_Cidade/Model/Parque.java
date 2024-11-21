 package com.example.Jogo_Cidade.model;

import jakarta.persistence.*;

@Entity
public class Parque extends Edificio {
    private int areaVerde;

    public Parque(String nome, int areaVerde, Nivel nivel) {
        super(nome, "Parque", nivel);
        this.areaVerde = areaVerde;
    }

    @Override
    public String toString() {
        return super.toString() + " - Area verde: " + areaVerde + "m²";
    }
}
