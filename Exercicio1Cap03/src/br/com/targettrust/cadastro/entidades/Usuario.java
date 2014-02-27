package br.com.targettrust.cadastro.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity 
@Table(name="USUARIOS", uniqueConstraints= @UniqueConstraint(columnNames= "CPF"))
public class Usuario implements Serializable {
	/**
	 * @author cassio Classe para armazenar dados do Cliente
	 */
	private static final long serialVersionUID = 3585353208482128268L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nome; 
	
	@Column(nullable=false)
	private String rg;
	
	@Column(nullable=false)
	private String cpf;
	
	@Temporal(TemporalType.TIME)
	private Date dataNasc;
	
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	public Usuario() {
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg
	 *            the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dataNasc
	 */
	public Date getDataNasc() {
		return dataNasc;
	}

	/**
	 * @param dataNasc
	 *            the dataNasc to set
	 */
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	 * @return the estadoCivil
	 */
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil
	 *            the estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}