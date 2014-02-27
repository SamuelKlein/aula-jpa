package com.targettrust.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TURMAS")
public class Turma implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TURMA_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nome;
	
	@Column(name = "TOTAL_ALUNOS")
	private int totalAlunos;
	
	@JoinColumn(name="SALA_ID")
	@ManyToOne(cascade={CascadeType.ALL})
	private Sala sala;
	
	public Turma() {
		
	}
	
	public Turma(String nome, int totalAlunos, Sala sala) {
		super();
		this.nome = nome;
		this.totalAlunos = totalAlunos;
		this.sala = sala;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTotalAlunos() {
		return totalAlunos;
	}
	
	public void setTotalAlunos(int totalAlunos) {
		this.totalAlunos = totalAlunos;
	}
	
}
