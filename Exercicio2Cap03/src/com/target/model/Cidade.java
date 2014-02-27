package com.target.model;

import java.io.Serializable;
import java.lang.String;



import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cidade
 * 
 */
@Entity
@Table(name = "CIDADES")
public class Cidade implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CIDADE_ID")
	private long id;

	@Column(length=60)
	private String nome;

	@Column(name="CODIGO_POSTAL", length=10)
	private String codigoPostal ;

	@Column( length=2)
	private String estado;

	private static final long serialVersionUID = 1L;

	public Cidade() {
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

	

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



}
