package model.tab;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "INSTRUTORES", uniqueConstraints = {
				@UniqueConstraint(columnNames = {
				"TURMA", "NOME" }) })
public class Instrutor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int  matricula;
	
	@Column(length = 60)
	private String nome;

	@Column(length = 30)
	private String turma;
	
	@Column(name = "DATA_ATUALIZACAO")
	@Temporal(TemporalType.DATE)
	private Date dataAtualizacao;
	
	
	@JoinColumn(name="endereco",columnDefinition="codigo")
	@OneToOne
	private Endereco endereco;
	
	public Instrutor() {
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
}
