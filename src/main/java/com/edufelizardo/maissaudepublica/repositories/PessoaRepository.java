package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
