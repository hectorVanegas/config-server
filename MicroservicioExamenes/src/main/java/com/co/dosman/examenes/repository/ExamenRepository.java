package com.co.dosman.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.dosman.common.entity.Examen;


@Repository
public interface ExamenRepository extends CrudRepository<Examen, Long> {
}
