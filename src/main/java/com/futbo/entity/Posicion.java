package com.futbo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "posicion")
public class Posicion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_posicion;
	private String nombre;

}
