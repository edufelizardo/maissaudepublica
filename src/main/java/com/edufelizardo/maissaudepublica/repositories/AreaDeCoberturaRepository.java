package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.AreaDeCobertura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDeCoberturaRepository extends CrudRepository<AreaDeCobertura, Long> {
}
