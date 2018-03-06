package com.rl.rmoney.api.repository;

import com.rl.rmoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 06/03/2018
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
