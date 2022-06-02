package org.indra.proyectoJsierra.models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Table(name="Team")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String nombre;
	@Column(name="Coach")
	private String entrenador;
	@Column(name="Captain")
	private String capitan;
	@Column(name="Ranking")
	private int posicion;
	
}
