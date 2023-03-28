package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.ExameFisico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameFisicoRepository extends CrudRepository<ExameFisico, Long> {
}
