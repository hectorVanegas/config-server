package com.co.dosman.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.dosman.common.entity.Alumno;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
