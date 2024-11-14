 package com.example.Jogo_Cidade.Model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// @Entity
public class Parque extends Edificio {
    private int areaVerde;

    // public Parque(String nome, int areaVerde, Nivel nivel) {
    //     super(nome, "Parque", nivel);
    //     this.areaVerde = areaVerde;
    // }

    @Override
    public String toString() {
        return super.toString() + " - Area verde: " + areaVerde + "m²";
    }
}
