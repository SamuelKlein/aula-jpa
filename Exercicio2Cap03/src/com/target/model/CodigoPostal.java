package com.target.model;

import java.io.Serializable;

import javax.persistence.*;

import com.target.model.TipoCodigoPostal;

/**
 * Entity implementation class for Entity: CodigoPostal
 * 
 */
@Entity
public class CodigoPostal implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "NUMERO_ID")
	private long numero;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private TipoCodigoPostal tipo;

	private static final long serialVersionUID = 1L;

	public CodigoPostal() {
		super();
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public long getNumero() {
		return this.numero;
	}

	public TipoCodigoPostal getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoCodigoPostal tipo) {
		this.tipo = tipo;
	}




}
