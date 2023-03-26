package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Endereco;
import com.edufelizardo.maissaudepublica.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
