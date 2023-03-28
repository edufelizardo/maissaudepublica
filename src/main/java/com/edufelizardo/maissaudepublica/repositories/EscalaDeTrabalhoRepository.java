package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.EscalaTrabalho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscalaDeTrabalhoRepository extends CrudRepository<EscalaTrabalho, Long> {
}
