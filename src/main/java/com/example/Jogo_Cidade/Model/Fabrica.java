package com.example.Jogo_Cidade.Model;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
public class Fabrica extends Edificio {
    private int capacidadeProducao;

    // public Fabrica(String nome, int capacidadeProducao, Nivel nivel) {
    //     super(nome, "Fábrica", nivel);
    //     this.capacidadeProducao = capacidadeProducao;
    // }

    // @Override
    public String toString() {
        return super.toString() + " - Capacidade de Produção: " + capacidadeProducao + " unidades";
    }
}
