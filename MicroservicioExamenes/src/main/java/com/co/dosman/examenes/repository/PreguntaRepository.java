package com.co.dosman.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.dosman.common.entity.Pregunta;


@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {
}
