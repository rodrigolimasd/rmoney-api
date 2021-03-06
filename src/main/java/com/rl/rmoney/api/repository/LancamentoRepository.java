package com.rl.rmoney.api.repository;

import com.rl.rmoney.api.model.Lancamento;
import com.rl.rmoney.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 07/03/2018
 */
@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
