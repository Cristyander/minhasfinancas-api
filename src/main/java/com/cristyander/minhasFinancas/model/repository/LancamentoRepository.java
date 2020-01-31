package com.cristyander.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristyander.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
