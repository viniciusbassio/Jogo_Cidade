package com.example.Jogo_Cidade.Model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
public class ServicoPublico extends Edificio {
    private String tipoServico;
    private int capacidadeAtendimento;

    // public ServicoPublico(String nome, String tipoServico, int capacidadeAtendimento, Nivel nivel) {
    //     super(nome, "Serviço Público", nivel);
    //     this.tipoServico = tipoServico;
    //     this.capacidadeAtendimento = capacidadeAtendimento;
    // }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: " + tipoServico + " (Capacidade: " + capacidadeAtendimento + ")";
    }
}
