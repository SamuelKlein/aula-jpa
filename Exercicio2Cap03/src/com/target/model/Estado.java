package com.target.model;

import java.io.Serializable;
import java.lang.String;



import javax.persistence.*;

/**
 * Entity implementation class for Entity: Estado
 * 
 */
@Entity
@Table(name = "ESTADOS")
public class Estado implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ESTADO_ID")
	private long id;

	@Column(length = 100)
	private String nome;

	@Column(length = 2)
	private String sigla;
	
	@Column(length = 2)
	private String pais;
	private static final long serialVersionUID = 1L;

	public Estado() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setId(int id) {
		this.id = id;
	}



}
