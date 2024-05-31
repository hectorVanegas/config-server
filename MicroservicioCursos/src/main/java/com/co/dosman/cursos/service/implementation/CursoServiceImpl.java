package com.co.dosman.cursos.service.implementation;

import org.springframework.stereotype.Service;

import com.co.dosman.common.entity.Curso;
import com.co.dosman.common.service.CommonService;
import com.co.dosman.common.service.implementation.CommonServiceImpl;
import com.co.dosman.cursos.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {
}
