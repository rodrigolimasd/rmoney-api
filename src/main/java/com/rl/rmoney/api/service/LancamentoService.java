package com.rl.rmoney.api.service;

import com.rl.rmoney.api.model.Lancamento;
import com.rl.rmoney.api.model.Pessoa;
import com.rl.rmoney.api.repository.LancamentoRepository;
import com.rl.rmoney.api.repository.PessoaRepository;
import com.rl.rmoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 07/03/2018
 */
@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento){
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());

        if(pessoa==null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }

        lancamentoRepository.save(lancamento);

        return lancamento;
    }

}
