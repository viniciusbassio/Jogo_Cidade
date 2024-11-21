package com.example.Jogo_Cidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.Jogo_Cidade.model.Edificio;

public interface CidadeRepository extends JpaRepository<Edificio, Long> {
    Edificio findbyNomeEdificioModel(String Nome_Edificio_parametro);

    @Query(value = "Select * from Edificio Where Nome_Edificio = :nomeEdificio_parametro", nativeQuery = true)
    Edificio findbyNomeEdificioModel(String Nome_Edificio_parametro);
}
