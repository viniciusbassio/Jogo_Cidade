package com.example.Jogo_Cidade.Model;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// @Entity
public class Cidade {
   // @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private double orcamento;
    private int recursos;

    public Cidade(double orcamentoInicial, int recursosIniciais) {
        this.orcamento = orcamentoInicial;
        this.recursos = recursosIniciais;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public int getRecursos() {
        return recursos;
    }

    public void adicionarOrcamento(double valor) {
        orcamento += valor;
    }

    public void gastarOrcamento(double valor) {
        if (orcamento >= valor) {
            orcamento -= valor;
        } else {
            // showMessageDialog(null, "Orçamento insuficiente!");
        }
    }

    public void adicionarRecursos(int quantidade) {
        recursos += quantidade;
    }

    public void consumirRecursos(int quantidade) {
        if (recursos >= quantidade) {
            recursos -= quantidade;
        } else {
            // JOptionPane.showMessageDialog(null, "Recursos insuficientes!");
        }
    }
}

