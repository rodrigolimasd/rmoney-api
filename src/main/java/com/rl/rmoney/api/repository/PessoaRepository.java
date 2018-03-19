package com.rl.rmoney.api.repository;

import com.rl.rmoney.api.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 06/03/2018
 */
@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

    public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);

}
