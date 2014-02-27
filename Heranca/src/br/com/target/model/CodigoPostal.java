package br.com.target.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class CodigoPostal {
	@ManyToMany
	@JoinTable(name="cidade_codigopostal", 
			   joinColumns={@JoinColumn(columnDefinition="ID_CIDADE")}, 
			   inverseJoinColumns={@JoinColumn(columnDefinition="ID_CODIGOPOSTAL")} )
	private List<Cidade> cidades;
	@Id
	private String numero;
	@Enumerated(EnumType.STRING)
	private TipoCodigoPostal tipo;

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoCodigoPostal getTipo() {
		return tipo;
	}

	public void setTipo(TipoCodigoPostal tipo) {
		this.tipo = tipo;
	}

}
