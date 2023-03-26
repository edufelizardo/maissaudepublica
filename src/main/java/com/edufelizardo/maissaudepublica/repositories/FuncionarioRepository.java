package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
