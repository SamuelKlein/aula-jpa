package com.operacoes.model;

import javax.persistence.*;


@Entity
@Table(name = "ENDERECOS")

public class Endereco {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ENDERECO_ID")
	private int Id;
	private String endereco;
	
	public Endereco() {
	}

	public Endereco(String endereco) {
		super();
		this.endereco = endereco;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
