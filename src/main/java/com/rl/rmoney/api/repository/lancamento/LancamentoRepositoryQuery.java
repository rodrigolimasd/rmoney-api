package com.rl.rmoney.api.repository.lancamento;

import com.rl.rmoney.api.model.Lancamento;
import com.rl.rmoney.api.repository.filter.LancamentoFilter;

import java.util.List;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 07/03/2018
 */
public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
