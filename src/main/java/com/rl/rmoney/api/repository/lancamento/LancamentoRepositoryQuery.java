package com.rl.rmoney.api.repository.lancamento;

import com.rl.rmoney.api.model.Lancamento;
import com.rl.rmoney.api.repository.filter.LancamentoFilter;
import com.rl.rmoney.api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 07/03/2018
 */
public interface LancamentoRepositoryQuery {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
