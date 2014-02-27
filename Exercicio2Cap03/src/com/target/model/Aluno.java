package com.target.model;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Aluno
 * 
 */
@Entity
@Table(name = "ALUNOS", uniqueConstraints = @UniqueConstraint(columnNames = { "CPF" }))

public class Aluno  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ALUNO_ID")
	private long id;
	
	@Column(length = 20)
	private String apelido;

	@Column(length = 11)
	private String cpf;

	public Aluno() {
		super();
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public long getId() {
		return id;
	}

}
