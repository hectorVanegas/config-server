package com.co.dosman.examenes.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.dosman.common.controller.CommonController;
import com.co.dosman.common.entity.Pregunta;
import com.co.dosman.examenes.service.PreguntaService;


@RestController
public class PreguntaController extends CommonController<Pregunta, PreguntaService> {
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Pregunta pregunta) {
        Optional<Pregunta> preguntaGuardada = service.findById(id);

        if (preguntaGuardada.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Pregunta preguntaActualizada = preguntaGuardada.get();
        preguntaActualizada.setTexto(pregunta.getTexto());
        preguntaActualizada.setExamen(pregunta.getExamen());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(preguntaActualizada));
    }
}
