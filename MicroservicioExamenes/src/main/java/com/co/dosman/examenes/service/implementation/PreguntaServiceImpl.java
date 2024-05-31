package com.co.dosman.examenes.service.implementation;

import org.springframework.stereotype.Service;

import com.co.dosman.common.entity.Pregunta;
import com.co.dosman.common.service.CommonService;
import com.co.dosman.common.service.implementation.CommonServiceImpl;
import com.co.dosman.examenes.repository.PreguntaRepository;


@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {
}
