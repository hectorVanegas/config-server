package com.co.dosman.cursos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.dosman.common.entity.Curso;


@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {
}
