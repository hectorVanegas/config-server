package com.co.dosman.examenes.service.implementation;

import org.springframework.stereotype.Service;

import com.co.dosman.common.entity.Examen;
import com.co.dosman.common.service.CommonService;
import com.co.dosman.common.service.implementation.CommonServiceImpl;
import com.co.dosman.examenes.repository.ExamenRepository;


@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {
}
