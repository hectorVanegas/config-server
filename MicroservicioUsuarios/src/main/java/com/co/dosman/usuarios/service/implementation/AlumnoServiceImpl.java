package com.co.dosman.usuarios.service.implementation;

import com.co.dosman.common.entity.Alumno;
import com.co.dosman.common.service.CommonService;
import com.co.dosman.common.service.implementation.CommonServiceImpl;
import com.co.dosman.usuarios.repository.AlumnoRepository;

import org.springframework.stereotype.Service;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements CommonService<Alumno> {
}
