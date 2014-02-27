package br.com.target.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cidade {
	@OneToMany(mappedBy="cidade")
	private List<Bairro> bairros;
	@ManyToMany(mappedBy="cidades")
	private List<CodigoPostal> codigoPostais;
	@OneToOne
	private Estado estado;
	@Id
	private Integer id;
	private String nome;

	public List<Bairro> getBairros() {
		return bairros;
	}

	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}

	public List<CodigoPostal> getCodigoPostais() {
		return codigoPostais;
	}

	public void setCodigoPostais(List<CodigoPostal> codigoPostais) {
		this.codigoPostais = codigoPostais;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
