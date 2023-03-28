package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.HistoricoMedico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoMedicoRepository extends CrudRepository<HistoricoMedico, Long> {
}
