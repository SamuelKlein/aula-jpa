package com.target.model;

import java.io.Serializable;
import java.lang.String;



import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pais
 * 
 */
@Entity
@Table(name = "PAISES")

public class Pais implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAIS_ID")
	private long id;
	
	@Column(length=2)
	private String sigla;
	
	@Column(length=60)
	private String nome;

	private static final long serialVersionUID = 1L;

	public Pais() {
		super();
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
