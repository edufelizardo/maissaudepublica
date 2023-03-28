package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.PrescricaoMedica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescricaoMedicaRepository extends CrudRepository<PrescricaoMedica, Long> {
}
