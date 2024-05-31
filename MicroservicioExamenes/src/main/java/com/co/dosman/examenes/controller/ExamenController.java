package com.co.dosman.examenes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.dosman.common.controller.CommonController;
import com.co.dosman.common.entity.Examen;
import com.co.dosman.common.entity.Pregunta;
import com.co.dosman.examenes.service.ExamenService;


@RestController
public class ExamenController extends CommonController<Examen, ExamenService> {
	@PutMapping("/asignarPregunta/{id}")
    public ResponseEntity<?> asignarPregunta(@PathVariable Long id, @RequestBody List<Pregunta> preguntas) {
        Optional<Examen> examenGuardado = service.findById(id);

        if (examenGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Examen examenActualizado = examenGuardado.get();
        preguntas.forEach(pregunta -> {
        	examenActualizado.addPregunta(pregunta);
        });

        return ResponseEntity.status(HttpStatus.OK).body(service.save(examenActualizado));
    }
	
	@PutMapping("/eliminarPregunta/{id}")
    public ResponseEntity<?> eliminarPregunta(@PathVariable Long id, @RequestBody Pregunta pregunta) {
        Optional<Examen> examenGuardado = service.findById(id);

        if (examenGuardado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Examen examenActualizado = examenGuardado.get();
        examenActualizado.removePregunta(pregunta);

        return ResponseEntity.status(HttpStatus.OK).body(service.save(examenActualizado));
    }
}
