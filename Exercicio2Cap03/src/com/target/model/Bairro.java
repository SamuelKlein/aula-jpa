package com.target.model;

import java.io.Serializable;
import java.lang.String;



import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bairros
 * 
 */
@Entity
@Table(name = "BAIRROS")
public class Bairro implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "BAIRRO_ID")
	private long id;
	
	@Column(length=60)
	private String nome;

	private static final long serialVersionUID = 1L;

	public Bairro() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
