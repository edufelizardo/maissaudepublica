package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.EquipamentoDeSaude;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoDeSaudeRepository extends CrudRepository<EquipamentoDeSaude, Long> {
}
