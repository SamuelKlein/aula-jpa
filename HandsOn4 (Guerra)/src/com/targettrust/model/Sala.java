package com.targettrust.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="SALAS")
public class Sala implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SALA_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nome;
	
	public Sala() {
		
	}
	
	public Sala(String nome) {
		super();
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
