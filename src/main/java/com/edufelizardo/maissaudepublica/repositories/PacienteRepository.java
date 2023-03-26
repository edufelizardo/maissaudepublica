package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
}
