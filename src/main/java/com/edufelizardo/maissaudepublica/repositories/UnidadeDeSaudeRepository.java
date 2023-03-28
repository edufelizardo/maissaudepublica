package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.UnidadeDeSaude;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeDeSaudeRepository extends CrudRepository<UnidadeDeSaude, Long> {
}
