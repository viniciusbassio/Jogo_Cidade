 package com.example.Jogo_Cidade.model;

import jakarta.persistence.*;

@Entity
 public class Edificio {
    @Column(name = "Nome_Edificio")
    private String nome;
    @Column (name ="Tipo_Edificio")
    private String tipo;
    private Nivel nivel;

    
     private Cidade cidade;

     public enum Nivel {
         BAIXO(10000), MEDIO(20000), ALTO(50000);
         private final double custo;

         Nivel(double custo) {
             this.custo = custo;
        }

         public double getCusto() {
             return custo;
         }
     }

    public Edificio(String nome, String tipo, Nivel nivel) {
        
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() {
       
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ", Nível: " + nivel + ")";
    }
 }
