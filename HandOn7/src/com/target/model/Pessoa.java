package com.target.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Pessoa
 * 
 */
@Entity
@Table(name = "PESSOA_HIERAQUIA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCRIMINADOR", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	public Pessoa() {

	}

	public Pessoa(String rg, String name, String endereco) {
		this.rg = rg;
		this.name = name;
		this.endereco = endereco;
	}

	@Id
	private String rg;
	private String name;
	private String endereco;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
