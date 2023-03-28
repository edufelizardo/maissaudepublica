package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.ProgramaDeSaude;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaDeSaudeRepository extends CrudRepository<ProgramaDeSaude, Long> {
}
