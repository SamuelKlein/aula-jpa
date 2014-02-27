package com.target.model;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Endereco
 * 
 */
@Entity
@Table(name = "ENDERECOS")
public class Endereco implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ENDERECO_ID")
	private long id;

	@Column(length=120, nullable=false)
	private String rua;
	
	@Column(length=5, nullable=false)
	private int numero;

	@Column(length=5)
	private int complemento;

	@Column(name="CODIGO_POSTAL", length=10)
	private String codigoPostal;

	@Column(length=20)
	private String bairro;

	private static final long serialVersionUID = 1L;

	public Endereco() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getComplemento() {
		return complemento;
	}

	public void setComplemento(int complemento) {
		this.complemento = complemento;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



}
