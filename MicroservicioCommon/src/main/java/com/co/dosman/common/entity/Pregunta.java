package com.co.dosman.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "pregunta")
public class Pregunta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String texto;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTexto() {
		return texto;
	}



	public void setTexto(String texto) {
		this.texto = texto;
	}



	public Examen getExamen() {
		return examen;
	}



	public void setExamen(Examen examen) {
		this.examen = examen;
	}



	@JsonIgnoreProperties(value = { "preguntas" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examen_id")
	private Examen examen;
}
