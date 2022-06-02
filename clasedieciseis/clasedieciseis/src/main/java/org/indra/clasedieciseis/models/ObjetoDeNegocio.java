package org.indra.clasedieciseis.models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class ObjetoDeNegocio {
	
	@Id
	@GeneratedValue
	private int id;
}
