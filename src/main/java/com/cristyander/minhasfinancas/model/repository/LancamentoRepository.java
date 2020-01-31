package com.cristyander.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristyander.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
